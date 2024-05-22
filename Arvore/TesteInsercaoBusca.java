import java.util.Random;

public class TesteInsercaoBusca {
    public static void testeInsercaoOrdenada(Arvore arvore, int[] numeros) {
        try {
            long startTime = System.nanoTime();
            for (int num : numeros) {
                arvore.inserirOrdenado(num);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(
                    "Tempo de inserção ordenada (" + numeros.length + " elementos): " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante o teste de inserção ordenada: " + e.getMessage());
        }
    }

    public static void testeInsercaoInversa(Arvore arvore, int[] numeros) {
        try {
            long startTime = System.nanoTime();
            for (int num : numeros) {
                arvore.inserirInverso(num);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(
                    "Tempo de inserção inversa (" + numeros.length + " elementos): " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante o teste de inserção inversa: " + e.getMessage());
        }
    }

    public static void testeInsercaoAleatoria(Arvore arvore, int[] numeros) {
        try {
            long startTime = System.nanoTime();
            for (int num : numeros) {
                arvore.inserirAleatoriamente(num);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(
                    "Tempo de inserção aleatória (" + numeros.length + " elementos): " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante o teste de inserção aleatória: " + e.getMessage());
        }
    }

    public static void testeBusca(Arvore arvore) {
        try {
            long startTime, endTime, duration;

            // Busca do primeiro elemento
            startTime = System.nanoTime();
            arvore.buscarPrimeiro();
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Tempo de busca do primeiro elemento: " + duration + " nanossegundos");

            // Busca do elemento do meio
            startTime = System.nanoTime();
            arvore.buscarMeio();
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Tempo de busca do elemento do meio: " + duration + " nanossegundos");

            // Busca do último elemento
            startTime = System.nanoTime();
            arvore.buscarUltimo();
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Tempo de busca do último elemento: " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante o teste de busca: " + e.getMessage());
        }
    }

    public static void testeBuscaAleatoria(Arvore arvore) {
        try {
            Random rand = new Random();
            int tamanho = arvore.tamanho();

            if (tamanho == 0) {
                System.out.println("Árvore vazia!");
                return;
            }

            int valorAleatorio = rand.nextInt(tamanho) + 1; // Gera um número aleatório entre 1 e o tamanho da árvore
            long startTime = System.nanoTime();
            int valorEncontrado = arvore.buscarAleatorio(valorAleatorio);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            if (valorEncontrado == -1) {
                System.out.println("Valor aleatório buscado (" + valorAleatorio + ") não encontrado na árvore.");
            } else {
                System.out.println("Valor aleatório buscado (" + valorAleatorio + ") encontrado na árvore.");
            }

            System.out.println("Tempo de busca aleatória: " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante o teste de busca aleatória: " + e.getMessage());
        }
    }
}

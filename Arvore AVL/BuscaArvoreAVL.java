import java.util.Random;

public class BuscaArvoreAVL {
    public static void buscarPrimeiro(ArvoreAVL arvore, int primeiroElemento) {
        try {
            long start = System.nanoTime();
            arvore.buscar(primeiroElemento);
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Resultado da busca do primeiro elemento: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a busca do primeiro elemento: " + e.getMessage());
        }
    }

    public static void buscarUltimo(ArvoreAVL arvore, int ultimoElemento) {
        try {
            long start = System.nanoTime();
            arvore.buscar(ultimoElemento);
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Resultado da busca do último elemento: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a busca do último elemento: " + e.getMessage());
        }
    }

    public static void buscarDoMeio(ArvoreAVL arvore, int elementoDoMeio) {
        try {
            long start = System.nanoTime();
            arvore.buscar(elementoDoMeio);
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Resultado da busca do valor do meio: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a busca do valor do meio: " + e.getMessage());
        }
    }

    public static void buscarAleatorio(ArvoreAVL arvore, int[] valor) {
        try {
            Random random = new Random();
            int valorAleatorio = valor[random.nextInt(valor.length)];
            long start = System.nanoTime();
            arvore.buscar(valorAleatorio);
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Resultado da busca de um valor aleatório: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a busca de um valor aleatório: " + e.getMessage());
        }
    }

    public static void buscarInexistente(ArvoreAVL arvore) {
        try {
            long start = System.nanoTime();
            arvore.buscar(100000); // valor inexistente
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Resultado da busca de um valor inexistente: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a busca de um valor inexistente: " + e.getMessage());
        }
    }
}

public class InsercaoArvoreAVL {

    // Inserindo ordenadamente
    public static void inserirOrdenado(ArvoreAVL arvore, int[] valores) {
        try {
            long start = System.nanoTime();
            for (int valor : valores) {
                arvore.inserir(valor);
            }
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Insercao ordenada na Arvore AVL: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a inserção ordenada na Árvore AVL: " + e.getMessage());
        }
    }

    // Inserindo inversamente ordenado
    public static void inserirInversamenteOrdenado(ArvoreAVL arvore, int[] valores) {
        try {
            long start = System.nanoTime();
            for (int i = valores.length - 1; i >= 0; i--) {
                arvore.inserir(valores[i]);
            }
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Insercao inversamente ordenada Arvore AVL: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a inserção inversamente ordenada na Árvore AVL: " + e.getMessage());
        }
    }

    // Inserindo aleatoriamente
    public static void inserirAleatorio(ArvoreAVL arvore, int[] valores) {
        try {
            long start = System.nanoTime();
            for (int valor : valores) {
                arvore.inserir(valor);
            }
            long end = System.nanoTime();
            long result = (end - start);
            System.out.println("Insercao aleatoria na Arvore AVL: " + result + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a inserção aleatória na Árvore AVL: " + e.getMessage());
        }
    }

}

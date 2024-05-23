public class Main {
    public static void main(String[] args) {
        int[] numeros100 = GeradorNumerosAleatorios.gerarNumerosAleatorios(100);
        int[] numeros1000 = GeradorNumerosAleatorios.gerarNumerosAleatorios(1000);
        int[] numeros10000 = GeradorNumerosAleatorios.gerarNumerosAleatorios(10000);

        Arvore arvore = new Arvore();

        // Teste inserção ordenada
        TesteInsercaoBusca.testeInsercaoOrdenada(arvore, numeros100);
        TesteInsercaoBusca.testeInsercaoOrdenada(arvore, numeros1000);
        TesteInsercaoBusca.testeInsercaoOrdenada(arvore, numeros10000);

        // Teste inserção inversa
        TesteInsercaoBusca.testeInsercaoInversa(arvore, numeros100);
        TesteInsercaoBusca.testeInsercaoInversa(arvore, numeros1000);
        TesteInsercaoBusca.testeInsercaoInversa(arvore, numeros10000);

        // Teste inserção aleatória
        TesteInsercaoBusca.testeInsercaoAleatoria(arvore, numeros100);
        TesteInsercaoBusca.testeInsercaoAleatoria(arvore, numeros1000);
        TesteInsercaoBusca.testeInsercaoAleatoria(arvore, numeros10000);

        // Teste busca
        // Teste busca com diferentes tamanhos de array
        TesteInsercaoBusca.testeBusca(arvore, 100);
        TesteInsercaoBusca.testeBusca(arvore, 1000);
        TesteInsercaoBusca.testeBusca(arvore, 10000);
        TesteInsercaoBusca.testeBuscaAleatoria(arvore);

        long tempoBusca = arvore.buscar(100000); // Por exemplo, buscando pelo valor 100000

        if (tempoBusca == -1) {
            System.out.println("Valor não encontrado na árvore.");
        } else {
            System.out.println("Tempo de busca por valor inexistente na árvore: " + tempoBusca + " nanossegundos");
        }
    }
}

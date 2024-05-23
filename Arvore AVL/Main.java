public class Main {
    public static void main(String[] args) {
        // Gerar os conjuntos de dados
        int[] numeros100 = GeradorNumerosAleatorios.gerarNumerosAleatorios(100);
        int[] numeros1000 = GeradorNumerosAleatorios.gerarNumerosAleatorios(1000);
        int[] numeros10000 = GeradorNumerosAleatorios.gerarNumerosAleatorios(10000);

        // Criar uma instância da árvore AVL
        ArvoreAVL arvoreAVL = new ArvoreAVL();

        // Inserção dos valores nos conjuntos de dados na árvore AVL
        InsercaoArvoreAVL.inserirOrdenado(arvoreAVL, numeros100);
        InsercaoArvoreAVL.inserirOrdenado(arvoreAVL, numeros1000);
        InsercaoArvoreAVL.inserirOrdenado(arvoreAVL, numeros10000);

        InsercaoArvoreAVL.inserirInversamenteOrdenado(arvoreAVL, numeros100);
        InsercaoArvoreAVL.inserirInversamenteOrdenado(arvoreAVL, numeros1000);
        InsercaoArvoreAVL.inserirInversamenteOrdenado(arvoreAVL, numeros10000);

        InsercaoArvoreAVL.inserirAleatorio(arvoreAVL, numeros100);
        InsercaoArvoreAVL.inserirAleatorio(arvoreAVL, numeros1000);
        InsercaoArvoreAVL.inserirAleatorio(arvoreAVL, numeros10000);

        // Realizar buscas
        BuscaArvoreAVL.buscarPrimeiro(arvoreAVL, numeros100[0]);
        BuscaArvoreAVL.buscarPrimeiro(arvoreAVL, numeros1000[0]);
        BuscaArvoreAVL.buscarPrimeiro(arvoreAVL, numeros10000[0]);
        BuscaArvoreAVL.buscarUltimo(arvoreAVL, numeros100[numeros100.length - 1]);
        BuscaArvoreAVL.buscarUltimo(arvoreAVL, numeros1000[numeros1000.length - 1]);
        BuscaArvoreAVL.buscarUltimo(arvoreAVL, numeros10000[numeros10000.length - 1]);
        BuscaArvoreAVL.buscarDoMeio(arvoreAVL, numeros100[numeros100.length / 2]);
        BuscaArvoreAVL.buscarDoMeio(arvoreAVL, numeros1000[numeros1000.length / 2]);
        BuscaArvoreAVL.buscarDoMeio(arvoreAVL, numeros10000[numeros10000.length / 2]);
        BuscaArvoreAVL.buscarAleatorio(arvoreAVL, numeros100);
        BuscaArvoreAVL.buscarAleatorio(arvoreAVL, numeros1000);
        BuscaArvoreAVL.buscarAleatorio(arvoreAVL, numeros10000);
        BuscaArvoreAVL.buscarInexistente(arvoreAVL);
    }
}

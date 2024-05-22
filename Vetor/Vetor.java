import java.util.Random;

public class Vetor {
    public static void mergeSort(int[] vetor) {
        try {
            if (vetor.length <= 1) {
                return;
            }

            int meio = vetor.length / 2;
            int[] vetorEsquerda = new int[meio];
            int[] vetorDireita = new int[vetor.length - meio];

            for (int i = 0; i < meio; i++) {
                vetorEsquerda[i] = vetor[i];
            }
            for (int i = 0; i < vetor.length - meio; i++) {
                vetorDireita[i] = vetor[i + meio];
            }

            mergeSort(vetorEsquerda);
            mergeSort(vetorDireita);

            merge(vetorEsquerda, vetorDireita, vetor);
        } catch (Exception e) {
            System.out.println("Erro durante a execução do mergeSort: " + e.getMessage());
        }
    }

    public static void merge(int[] vetorEsquerda, int[] vetorDireita, int[] vetor) {
        try {
            int indiceEsq = 0;
            int indiceDir = 0;
            int indiceVetor = 0;

            while (indiceEsq < vetorEsquerda.length && indiceDir < vetorDireita.length) {
                if (vetorEsquerda[indiceEsq] < vetorDireita[indiceDir]) {
                    vetor[indiceVetor++] = vetorEsquerda[indiceEsq++];
                } else {
                    vetor[indiceVetor++] = vetorDireita[indiceDir++];
                }
            }

            while (indiceEsq < vetorEsquerda.length) {
                vetor[indiceVetor++] = vetorEsquerda[indiceEsq++];
            }
            while (indiceDir < vetorDireita.length) {
                vetor[indiceVetor++] = vetorDireita[indiceDir++];
            }
        } catch (Exception e) {
            System.out.println("Erro durante a execução do merge: " + e.getMessage());
        }
    }

    public static void bubbleSort(int[] vetor) {
        try {
            int n = vetor.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        // Troca os elementos
                        int temp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = temp;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erro durante a execução do bubbleSort: " + e.getMessage());
        }
    }

    public static int[] gerarArrayOrdenado(int tamanho) {
        try {
            int[] array = new int[tamanho];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            return array;
        } catch (Exception e) {
            System.out.println("Erro durante a geração do array ordenado: " + e.getMessage());
            return null;
        }
    }

    public static int[] gerarArrayInverso(int tamanho) {
        try {
            int[] array = new int[tamanho];
            for (int i = 0; i < array.length; i++) {
                array[i] = tamanho - i;
            }
            return array;
        } catch (Exception e) {
            System.out.println("Erro durante a geração do array inverso: " + e.getMessage());
            return null;
        }
    }

    public static int[] gerarArrayAleatorio(int tamanho) {
        int[] array = new int[tamanho];

        // Preenche o array com valores de 1 a tamanho
        for (int i = 0; i < tamanho; i++) {
            array[i] = i + 1;
        }

        // Embaralha o array
        embaralharArray(array);

        return array;
    }

    // Método para embaralhar o array
    private static void embaralharArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Troca os elementos nas posições 'i' e 'index'
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static int buscaSequencial(int[] array, int valor) {
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == valor) {
                    return i; // Retorna o índice onde o valor foi encontrado
                }
            }
            return -1; // Retorna -1 se o valor não for encontrado no array
        } catch (Exception e) {
            System.out.println("Erro durante a busca sequencial: " + e.getMessage());
            return -1;
        }
    }

    public static int buscaBinaria(int[] array, int valor) {
        try {
            int inicio = 0;
            int fim = array.length - 1;

            while (inicio <= fim) {
                int meio = (inicio + fim) / 2;

                if (array[meio] == valor) {
                    return meio; // Retorna o índice onde o valor foi encontrado
                } else if (array[meio] < valor) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }

            return -1; // Retorna -1 se o valor não for encontrado no array
        } catch (Exception e) {
            System.out.println("Erro durante a busca binária: " + e.getMessage());
            return -1;
        }
    }

    public static void imprimirArray(int[] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(); // Adiciona uma quebra de linha no final para melhorar a formatação
        } catch (Exception e) {
            System.out.println("Erro durante a impressão do array: " + e.getMessage());
        }
    }
}

import java.util.Random;

public class Vetor {
    public void mergeSort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int meio = vetor.length /2;

            mergeSort(vetor, meio, esquerda);
            mergeSort(vetor, meio + 1, direita);

            merge(vetor, esquerda, meio, direita);
        }
    }
    public void merge(int[] vetor, int esquerda, int meio, int direita){
        int tamanhoEsquerda = meio - esquerda +1;
        int tamanhoDireita = direita - meio;

         // Arrays temporários
         int[] esquerdaArray = new int[tamanhoEsquerda];
         int[] direitaArray = new int[tamanhoDireita];
 
         // Copiando dados para os arrays temporários
         for (int i = 0; i < tamanhoEsquerda; ++i) {
             esquerdaArray[i] = vetor[esquerda + i];
         }
         for (int j = 0; j < tamanhoDireita; ++j) {
             direitaArray[j] = vetor[meio + 1 + j];
         }
 
         // Merge dos arrays temporários
 
         // Índices iniciais dos sub-arrays e do array mesclado
         int i = 0, j = 0;
         int k = esquerda;
 
         while (i < tamanhoEsquerda && j < tamanhoDireita) {
             if (esquerdaArray[i] <= direitaArray[j]) {
                 vetor[k] = esquerdaArray[i];
                 i++;
             } else {
                 vetor[k] = direitaArray[j];
                 j++;
             }
             k++;
         }
 
         // Copiando os elementos restantes de esquerdaArray, se houver algum
         while (i < tamanhoEsquerda) {
             vetor[k] = esquerdaArray[i];
             i++;
             k++;
         }
 
         // Copiando os elementos restantes de direitaArray, se houver algum
         while (j < tamanhoDireita) {
             vetor[k] = direitaArray[j];
             j++;
             k++;
         }
    }
    public static int[] gerarArrayOrdenado(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] gerarArrayInverso(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < array.length; i++) {
            array[i] = tamanho - i;
        }
        return array;
    }

    // Método para gerar array aleatório
    public static int[] gerarArrayAleatorio(int tamanho) {
        int[] array = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(tamanho) + 1;
        }
        return array;
    }

    public static int buscaSequencial(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice onde o valor foi encontrado
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado no array
    }
    
    public static int buscaBinaria(int[] array, int valor) {
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
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Adiciona uma quebra de linha no final para melhorar a formatação
    }
}
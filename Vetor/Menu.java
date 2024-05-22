import java.util.Random;
import java.util.Scanner;

public class Menu {

    private MedidorDeTempo medidor;
    private Scanner scanner;

    public Menu() {
        medidor = new MedidorDeTempo();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            try {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Medir tempo de inserção e busca em Array Ordenado");
                System.out.println("2. Medir tempo de inserção e busca em Array Inversamente Ordenado");
                System.out.println("3. Medir tempo de inserção e busca em Array Aleatório");
                System.out.println("4. Medir tempo de ordenação com Bubble Sort");
                System.out.println("5. Medir tempo de ordenação com Merge Sort");
                System.out.println("6. Encerrar programa");
                int escolha = scanner.nextInt();

                if (escolha == 6) {
                    System.out.println("Programa encerrado.");
                    break;
                }

                switch (escolha) {
                    case 1:
                        System.out.println("Digite o tamanho do array (100, 1000, 10000):");
                        int tamanho = scanner.nextInt();
                        System.out.println("Digite o valor a ser buscado:");
                        int valorBusca = scanner.nextInt();
                        medidor.medirTempoGeracaoArrayOrdenado(tamanho);
                        medidor.medirTempoBuscaSequencialOrdenado(tamanho, valorBusca);
                        medidor.medirTempoBuscaBinariaOrdenado(tamanho, valorBusca);
                        break;
                    case 2:
                        System.out.println("Digite o tamanho do array (100, 1000, 10000):");
                        int tamanhoinverso = scanner.nextInt();
                        System.out.println("Digite o valor a ser buscado:");
                        int valorBuscainverso = scanner.nextInt();
                        medidor.medirTempoGeracaoArrayInverso(tamanhoinverso);
                        medidor.medirTempoBuscaSequencialInverso(tamanhoinverso, valorBuscainverso);
                        // Busca binária em array inverso não é aplicável, pois a busca binária exige
                        // array ordenado.
                        System.out.println("Busca binária não aplicável em array inversamente ordenado.\n\n");
                        break;
                    case 3:
                        System.out.println("Digite o tamanho do array (100, 1000, 10000):");
                        int tamanhorandom = scanner.nextInt();
                        System.out.println("Digite o valor a ser buscado:");
                        int valorBuscarandom = scanner.nextInt();
                        medidor.medirTempoGeracaoArrayAleatorio(tamanhorandom);
                        medidor.medirTempoBuscaSequencialAleatorio(tamanhorandom, valorBuscarandom);
                        // Busca binária em array aleatório não é aplicável, pois a busca binária exige
                        // array ordenado.
                        System.out.println("Busca binária não aplicável em array aleatório.\n\n");
                        break;
                    case 4:
                        System.out.println("Digite o tamanho do array (100, 1000, 10000):");
                        int tamanhoBubble = scanner.nextInt();
                        int[] vetorBubble = new int[tamanhoBubble];
                        Random random = new Random();
                        for (int i = 0; i < tamanhoBubble; i++) {
                            vetorBubble[i] = random.nextInt(); // Preenche o vetor com números aleatórios
                        }
                        medidor.medirTempoOrdenacaoBubbleSort(vetorBubble);
                        break;
                    case 5:
                        System.out.println("Digite o tamanho do array (100, 1000, 10000):");
                        int tamanhoMerge = scanner.nextInt();
                        int[] vetorMerge = new int[tamanhoMerge];
                        Random randomb = new Random();
                        for (int i = 0; i < tamanhoMerge; i++) {
                            vetorMerge[i] = randomb.nextInt(); // Preenche o vetor com números aleatórios
                        }
                        medidor.medirTempoOrdenacaoMergeSort(vetorMerge);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine(); // Limpar o buffer do scanner para evitar looping infinito
            }
        }
        scanner.close();
    }
}

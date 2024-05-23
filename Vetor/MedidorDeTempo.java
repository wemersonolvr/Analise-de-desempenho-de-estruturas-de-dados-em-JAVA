public class MedidorDeTempo {

    public void molduraInicioArray(String tipoArray) {
        System.out.println(
                "\n=============== Medindo Tempo de inserção e busca em Array " + tipoArray + " ===============\n");
    }

    public void medirTempoGeracaoArrayOrdenado(int tamanho) {
        molduraInicioArray("Ordenado");
        try {
            long startTime = System.nanoTime();
            Vetor.gerarArrayOrdenado(tamanho);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo para gerar array em ordem: " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a geração do array ordenado: " + e.getMessage());
        }
    }

    public void medirTempoBuscaSequencialOrdenado(int tamanho, int valorBusca) {
        try {
            int[] arrayOrdenado = Vetor.gerarArrayOrdenado(tamanho);
            long inicio = System.nanoTime();
            int resultado = Vetor.buscaSequencial(arrayOrdenado, valorBusca);
            long tempofinal = System.nanoTime();
            long duracaosequencial = (tempofinal - inicio);
            if (resultado == -1) {
                System.out.println("Valor " + valorBusca + " não encontrado. Tempo para busca sequencial no ordenado: "
                        + duracaosequencial + " nanossegundos");
            } else {
                System.out.println("Valor " + valorBusca + " encontrado na posição " + resultado
                        + ". Tempo para busca sequencial no ordenado: " + duracaosequencial + " nanossegundos");
            }
        } catch (Exception e) {
            System.out.println("Erro durante a busca sequencial no array ordenado: " + e.getMessage());
        }
    }

    public void medirTempoBuscaBinariaOrdenado(int tamanho, int valorBusca) {
        try {
            int[] arrayOrdenado = Vetor.gerarArrayOrdenado(tamanho);
            long iniciobinario = System.nanoTime();
            int resultado = Vetor.buscaBinaria(arrayOrdenado, valorBusca);
            long tempofinalbinario = System.nanoTime();
            long duracaobinario = (tempofinalbinario - iniciobinario);
            if (resultado < 0) {
                System.out.println("Valor " + valorBusca + " não encontrado. Tempo para busca binária no ordenado: "
                        + duracaobinario + " nanossegundos");
            } else {
                System.out.println("Valor " + valorBusca + " encontrado na posição " + resultado
                        + ". Tempo para busca binária no ordenado: " + duracaobinario + " nanossegundos");
            }
        } catch (Exception e) {
            System.out.println("Erro durante a busca binária no array ordenado: " + e.getMessage());
        }
    }

    public void medirTempoGeracaoArrayInverso(int tamanho) {
        molduraInicioArray("Inversamente Ordenado");
        try {
            long startTime = System.nanoTime();
            Vetor.gerarArrayInverso(tamanho);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo para gerar array em ordem inversa: " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a geração do array inversamente ordenado: " + e.getMessage());
        }
    }

    public void medirTempoBuscaSequencialInverso(int tamanho, int valorBusca) {
        try {
            int[] arrayInverso = Vetor.gerarArrayInverso(tamanho);
            long inicio = System.nanoTime();
            int resultado = Vetor.buscaSequencial(arrayInverso, valorBusca);
            long tempofinal = System.nanoTime();
            long duracaosequencial = (tempofinal - inicio);
            if (resultado == -1) {
                System.out.println("Valor " + valorBusca
                        + " não encontrado. Tempo para busca sequencial no inversamente ordenado: " + duracaosequencial
                        + " nanossegundos");
            } else {
                System.out.println("Valor " + valorBusca + " encontrado na posição " + resultado
                        + ". \nTempo para busca sequencial no inversamente ordenado: " + duracaosequencial
                        + " nanossegundos");
            }
        } catch (Exception e) {
            System.out.println("Erro durante a busca sequencial no array inversamente ordenado: " + e.getMessage());
        }
    }

    public void medirTempoGeracaoArrayAleatorio(int tamanho) {
        molduraInicioArray("Aleatório");
        try {
            long startTime = System.nanoTime();
            Vetor.gerarArrayAleatorio(tamanho);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo para gerar array aleatório: " + duration + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a geração do array aleatório: " + e.getMessage());
        }
    }

    public void medirTempoBuscaSequencialAleatorio(int tamanho, int valorBusca) {
        try {
            int[] arrayAleatorio = Vetor.gerarArrayAleatorio(tamanho);
            long inicio = System.nanoTime();
            int resultado = Vetor.buscaSequencial(arrayAleatorio, valorBusca);
            long tempofinal = System.nanoTime();
            long duracaosequencial = (tempofinal - inicio);
            if (resultado == -1) {
                System.out.println("Valor " + valorBusca + " não encontrado.\n Tempo para busca sequencial no aleatório: "
                        + duracaosequencial + " nanossegundos");
            } else {
                System.out.println("Valor " + valorBusca + " encontrado na posição " + resultado
                        + ". Tempo para busca sequencial no aleatório: " + duracaosequencial + " nanossegundos");
            }
        } catch (Exception e) {
            System.out.println("Erro durante a busca sequencial no array aleatório: " + e.getMessage());
        }
    }

    public void medirTempoOrdenacaoBubbleSort(int[] tamanho) {
        try {
            long inicio = System.nanoTime();
            Vetor.bubbleSort(tamanho);
            long fim = System.nanoTime();
            long duracao = fim - inicio;
            System.out.println("=============== Medindo Tempo de ordenação em Array com bubbleSort ===============\\n");
            System.out.println("Vetor ordenado com Bubble Sort em " + duracao + " nanossegundos.");
        } catch (Exception e) {
            System.out.println("Erro durante a ordenação do vetor com Bubble Sort: " + e.getMessage());
        }
    }

    public void medirTempoOrdenacaoMergeSort(int[] tamanho) {
        try {
            long inicio = System.nanoTime();
            Vetor.mergeSort(tamanho);
            long fim = System.nanoTime();
            long duracao = fim - inicio;
            System.out.println("=============== Medindo Tempo de ordenação em Array com Merge Sort ===============\\n");
            System.out.println("Vetor ordenado com Merge Sort em " + duracao + " nanossegundos.");
        } catch (Exception e) {
            System.out.println("Erro durante a ordenação do vetor com Merge Sort: " + e.getMessage());
        }
    }
}
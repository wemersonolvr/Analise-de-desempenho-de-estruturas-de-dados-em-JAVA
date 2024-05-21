public class Main {
    public static void main(String[] args) {
        long startTime, endTime, duration;
        long inicio, tempofinal, duracaosequencial;
        long iniciobinario, tempofinalbinario, duracaobinario;

        // Medindo o tempo de execução para o método de geração de array em ordem
        startTime = System.nanoTime();
        int[] arrayOrdenado = Vetor.gerarArrayOrdenado(10000000);
        endTime = System.nanoTime();
        duration = (endTime - startTime); 
        System.out.println("Tempo para gerar array em ordem: " + duration + " nanossegundos");
        //Vetor.imprimirArray(arrayOrdenado);

        //medindo tempo de busca sequencial em array em ordem
        inicio = System.nanoTime();
        Vetor.buscaSequencial(arrayOrdenado, 50000);
        tempofinal = System.nanoTime();
        duracaosequencial = (tempofinal - inicio);
        System.out.println("Tempo para busca sequencial no ordenado: " + duracaosequencial + " nanossegundos");


        //medindo tempo de busca binária em array em ordem
        iniciobinario = System.nanoTime();
        Vetor.buscaBinaria(arrayOrdenado, 50000);
        tempofinalbinario = System.nanoTime();
        duracaobinario = (tempofinalbinario - iniciobinario);
        System.out.println("Tempo para busca binária no ordenado: " + duracaobinario + " nanossegundos");



        // Medindo o tempo de execução para o método de geração de array em ordem inversa
        startTime = System.nanoTime();
        int[] arrayInverso = Vetor.gerarArrayInverso(10000000);
        endTime = System.nanoTime();
        duration = (endTime - startTime); 
        System.out.println("Tempo para gerar array em ordem: " + duration + " nanossegundos");
        //Vetor.imprimirArray(arrayInverso);


        //medindo tempo de busca sequencial em array em ordem inversa
        inicio = System.nanoTime();
        Vetor.buscaSequencial(arrayInverso, 50000);
        tempofinal = System.nanoTime();
        duracaosequencial = (tempofinal - inicio);
        System.out.println("Tempo para busca sequencial no inversamente ordenado: " + duracaosequencial + " nanossegundos");



        // Medindo o tempo de execução para o método de geração de array aleatório
        startTime = System.nanoTime();
        int[] arrayAleatorio = Vetor.gerarArrayAleatorio(10000000);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Tempo para gerar array em ordem: " + duration + " nanossegundos");
        //Vetor.imprimirArray(arrayAleatorio);


        //medindo tempo de busca sequencial em array aleatório
        inicio = System.nanoTime();
        Vetor.buscaSequencial(arrayAleatorio, 50000);
        tempofinal = System.nanoTime();
        duracaosequencial = (tempofinal - inicio);
        System.out.println("Tempo para busca senquencial no aleatório: " + duracaosequencial + " nanossegundos");
    
    }
}


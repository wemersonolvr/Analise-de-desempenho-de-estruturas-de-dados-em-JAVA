import java.util.Random;

public class GeradorNumerosAleatorios {
    public static int[] gerarNumerosAleatorios(int tamanho) {
        try {
            Random random = new Random();
            int[] numeros = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                numeros[i] = random.nextInt();
            }
            return numeros;
        } catch (Exception e) {
            System.out.println("Erro ao gerar números aleatórios: " + e.getMessage());
            return null;
        }
    }
}

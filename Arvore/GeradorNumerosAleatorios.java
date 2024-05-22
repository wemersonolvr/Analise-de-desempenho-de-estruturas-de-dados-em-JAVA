import java.util.Random;

public class GeradorNumerosAleatorios {
    public static int[] gerarNumerosAleatorios(int quantidade) {
        try {
            int[] numeros = new int[quantidade];
            Random rand = new Random();
            for (int i = 0; i < quantidade; i++) {
                numeros[i] = rand.nextInt(10000); // Gera números aleatórios até 10000
            }
            return numeros;
        } catch (Exception e) {
            System.out.println("Erro ao gerar números aleatórios: " + e.getMessage());
            return null;
        }
    }
}

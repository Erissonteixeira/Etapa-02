import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];

        System.out.println("Numeros Gerados: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(101);
            System.out.println(numeros[i] + " ");
        }
        System.out.println("_____________");

        int menor = numeros[0];
        int maior = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
                System.out.println("Menor número: " + menor);
                System.out.println("Maior número: " + maior);
            }

        }
    }
}

import java.util.Scanner;
public class AlterandoExercicioFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número limite para a série de fibonacci: ");
        int limite = scanner.nextByte();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Série de fibonacci até " + limite + ": ");

        while (primeiro <=limite) {
            System.out.println(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        scanner.close();

    }
}

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos números da sequência de Fibonacci você quer ver: ");
        int quantidade = scanner.nextInt();
        System.out.println("Série de fibonacci: ");

        int primeiro = 0;
        int segundo = 1;

        for (int i = 0; i < quantidade; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            
        }

    }
}

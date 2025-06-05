import java.util.Scanner;
public class LeiaUmNumeroAte10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numeroDigitado = 0;
        System.out.println("__________________");

        while (numeroDigitado !=10){
            System.out.println("Exit: 10 ");
            numeroDigitado = scanner.nextInt();
        }
        System.out.println("Você digitou 10. programa encerrado. ");
        scanner.close();
    }
}

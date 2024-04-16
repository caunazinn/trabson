import java.util.Scanner;

public class MaxDivCom {
    public void mdc(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int a = num1;
        int b = num2;
        int resto;

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        System.out.println("O MDC é: " + a);

        scanner.close();
    }
}

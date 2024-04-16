import java.util.Scanner;
public class Fib {
    int n1 = 0;
    int n2 = 1;
    public void sequenciaFib(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para gerar a sequência de Fibonacci: ");
        int n = scanner.nextInt();


        String res = n1 + ", " + n2;

        if (n == 1) {
            System.out.println("Sequência de Fibonacci até " + n + ": " + n1);
            return;
        } else if (n == 2) {
            System.out.println("Sequência de Fibonacci até " + n + ": " + n1 + ", " + n2);
            return;
        }

        for (int i = 3; i <= n; i++) {
            int n3 = n1 + n2;
            res += ", " + n3;
            n1 = n2;
            n2 = n3;
        }

        System.out.println("Sequência de Fibonacci até " + n + ": " + res);

    }
}

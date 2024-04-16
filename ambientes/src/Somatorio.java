import java.util.Scanner;

public class Somatorio {
        public void somar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("O somatório dos números é: " + soma);

        scanner.close();
    }
}
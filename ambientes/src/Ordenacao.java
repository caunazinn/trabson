import java.util.Scanner;

public class Ordenacao {
    public void ordem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os números para ver a ordem: ");
        String entrada = scanner.nextLine();

        String[] numar = entrada.split(" ");
        int[] numeros = new int[numar.length];

        for (int i = 0; i < numar.length; i++) {
            numeros[i] = Integer.parseInt(numar[i]);
        }

        int[] numerosOrden = quickSort(numeros, 0, numeros.length - 1);

        System.out.print("Números ordenados: ");
        for (int num : numerosOrden) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] quickSort(int[] numeros, int baixo, int alto) {
        if (baixo < alto) {
            int indicePivo = particionar(numeros, baixo, alto);
            quickSort(numeros, baixo, indicePivo - 1);
            quickSort(numeros, indicePivo + 1, alto);
        }
        return numeros;
    }

    public static int particionar(int[] numeros, int baixo, int alto) {
        int pivo = numeros[alto];
        int i = baixo - 1;

        for (int j = baixo; j < alto; j++) {
            if (numeros[j] < pivo) {
                i++;
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }

        int temp = numeros[i + 1];
        numeros[i + 1] = numeros[alto];
        numeros[alto] = temp;

        return i + 1;
    }
}

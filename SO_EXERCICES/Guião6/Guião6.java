package Ex7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        double[] numeros = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        int indiceMeio = tamanho / 2;

        double menorAntes = Double.MAX_VALUE;
        for (int i = 0; i < indiceMeio; i++) {
            if (numeros[i] < menorAntes) {
                menorAntes = numeros[i];
            }
        }

        double maiorDepois = Double.MIN_VALUE;
        for (int i = indiceMeio + 1; i < tamanho; i++) {
            if (numeros[i] > maiorDepois) {
                maiorDepois = numeros[i];
            }
        }

        System.out.println("Menor valor antes do elemento do meio: " + menorAntes);

        System.out.println("Maior valor depois do elemento do meio: " + maiorDepois);

        scanner.close();
    }
}
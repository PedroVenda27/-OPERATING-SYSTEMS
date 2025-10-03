package Ex7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do array ao usuário
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        // Cria o array com o tamanho especificado
        double[] numeros = new double[tamanho];

        // Solicita os números ao usuário e os armazena no array
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Encontra o índice do elemento do meio
        int indiceMeio = tamanho / 2;

        // Encontra o menor valor antes do elemento do meio
        double menorAntes = Double.MAX_VALUE;
        for (int i = 0; i < indiceMeio; i++) {
            if (numeros[i] < menorAntes) {
                menorAntes = numeros[i];
            }
        }

        // Encontra o maior valor depois do elemento do meio
        double maiorDepois = Double.MIN_VALUE;
        for (int i = indiceMeio + 1; i < tamanho; i++) {
            if (numeros[i] > maiorDepois) {
                maiorDepois = numeros[i];
            }
        }

        // Imprime o menor valor antes do elemento do meio
        System.out.println("Menor valor antes do elemento do meio: " + menorAntes);

        // Imprime o maior valor depois do elemento do meio
        System.out.println("Maior valor depois do elemento do meio: " + maiorDepois);

        scanner.close();
    }
}
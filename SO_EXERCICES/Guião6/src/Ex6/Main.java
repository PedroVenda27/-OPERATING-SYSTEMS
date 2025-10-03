package Ex6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        double[] numeros = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do Array " + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Elementos do array que são múltiplos de 3 na ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            if (numeros[i] % 3 == 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}

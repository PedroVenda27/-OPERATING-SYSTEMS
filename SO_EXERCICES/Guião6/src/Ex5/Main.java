package Ex5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo: ");
        int n = scanner.nextInt();

        System.out.println("Contagem decrescente até -" + n + ":");
        imprimirContagemDecrescente(n);

        scanner.close();
    }

    public static void imprimirContagemDecrescente(int n) {
        for (int i = n; i >= -n; i--) {
            System.out.print(i);
            if (i != -n) {
                System.out.print(", ");
            }
        }
        System.out.println();

	}

}

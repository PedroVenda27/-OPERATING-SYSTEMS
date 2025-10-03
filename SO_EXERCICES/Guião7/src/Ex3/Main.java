package Ex3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        while (true) {
            System.out.print("Insira uma frase ou palavra (digite 'quit' para sair): ");
            String input = scanner.nextLine();


            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Programa encerrado.");
                break;
            }

            
            if (input.length() % 2 == 0) {
                System.out.println("Frase/Palavra invertida: " + reverseString(input));
            } else {
                System.out.println("Frase/Palavra original: " + input);
            }
        }

        scanner.close();
    }

    
    // Função para inverter uma string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

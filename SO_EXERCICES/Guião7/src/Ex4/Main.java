package Ex4;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir duas strings
        System.out.print("Insira a primeira string: ");
        String str1 = scanner.nextLine();

        System.out.print("Insira a segunda string: ");
        String str2 = scanner.nextLine();

        if (areMirrorImages(str1, str2)) {
            System.out.println("As strings são imagens uma da outra.");
        } else {
            System.out.println("As strings não são imagens uma da outra.");
        }

        scanner.close();
    }
    
    public static boolean areMirrorImages(String str1, String str2) {
        
    	
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

package Ex5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira a primeira frase: ");
        String str1 = scanner.nextLine();

        System.out.print("Insira a segunda frase: ");
        String str2 = scanner.nextLine()
        		
        String mixedString = mixStrings(str1, str2);
        System.out.println("Nova string misturada: " + mixedString);

        scanner.close();
    }


    public static String mixStrings(String str1, String str2) {
        StringBuilder mixed = new StringBuilder();
        
        int length1 = str1.length();
        int length2 = str2.length();
        
        int minLength = Math.min(length1, length2);

        
        for (int i = 0; i < minLength; i++) {
            mixed.append(str1.charAt(i));
            mixed.append(str2.charAt(i));
        }

        if (length1 > length2) {
            mixed.append(str1.substring(minLength));
        } else if (length2 > length1) {
            mixed.append(str2.substring(minLength));
        }

        return mixed.toString();
    }
}

package Ex3;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
        int[] numeros = {10, 25, 7, 30, 15, 42, 50};
        int[] multiplos = obterMultiplosDe5(numeros);

        System.out.print("Elementos múltiplos de 5: ");
        for (int i = 0; i < multiplos.length; i++) {
            System.out.print(multiplos[i] + " ");
        }
    }

    public static int[] obterMultiplosDe5(int[] numeros) {
        ArrayList<Integer> multiplosList = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 5 == 0) {
                multiplosList.add(numeros[i]);
            }
        }
        
        int[] multiplosArray = new int[multiplosList.size()];
        for (int i = 0; i < multiplosList.size(); i++) {
            multiplosArray[i] = multiplosList.get(i);
        }

        return multiplosArray;
    }
}



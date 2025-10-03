package Ex1;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	
        double[] array = {12, 31, 22, 45, 61};
        double diferencaMinima = calcularDiferencaMinima(array);
        System.out.println("Diferença mínima entre dois elementos do array: " + diferencaMinima);
    }

    public static double calcularDiferencaMinima(double[] array) {
        Arrays.sort(array);

        double diferencaMinima = Double.MAX_VALUE;
        
        for (int i = 0; i < array.length - 1; i++) {
            double diferencaAtual = Math.abs(array[i] - array[i + 1]);
            if (diferencaAtual < diferencaMinima) {
                diferencaMinima = diferencaAtual;
            }
        }

        return diferencaMinima;
    }
}

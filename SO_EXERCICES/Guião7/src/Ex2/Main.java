package Ex2;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array1 = {1, 3, 20};
        double[] array2 = {4, 69, 55};
        double[] mergedArray = mergeAndSortArrays(array1, array2);
        System.out.println("Array combinado e ordenado: " + Arrays.toString(mergedArray));
    }

 
    public static double[] mergeAndSortArrays(double[] array1, double[] array2) {

        int tamanhoNovoArray = array1.length + array2.length;
        double[] mergedArray = new double[tamanhoNovoArray];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }
}

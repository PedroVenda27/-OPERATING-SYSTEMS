package Ex4;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em segundos: ");
        int segundos = scanner.nextInt();

        String tempoFormatado = converterParaTempo(segundos);
        System.out.println("Tempo correspondente: " + tempoFormatado);

        scanner.close();
    }

    public static String converterParaTempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

 

}

package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		  ProcessBuilder pb = new ProcessBuilder("echo", "Hello from a new process.\n");

		  try {
			Process p = pb.start();
			
		    	BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String line;
		     
			while ((line = is.readLine()) != null)
				System.out.println(line);

			p.waitFor();
			System.out.println("done.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
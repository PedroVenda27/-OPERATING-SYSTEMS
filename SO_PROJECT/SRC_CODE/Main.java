package tpisrc;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> items = new Stack<String>();
		items.push("Coat");
		items.push("Lunchbox");
		items.push("GPS");
		items.push("Map");
		items.push("Notebook");
		
		Thread santa = new Thread(new Santa("Santa"));
		santa.start();		 
		
		Thread t1 = new Thread(new Gnome("Gnome 1", items));
		t1.start();
		
		Thread t2 = new Thread(new Gnome("Gnome 2", items));
		t2.start();
		
		Thread t3 = new Thread(new Gnome("Gnome 3", items));
		t3.start();
		
		Thread t4 = new Thread(new Gnome("Gnome 4", items));
		t4.start();
		
		Thread t5 = new Thread(new Gnome("Gnome 5", items));
		t5.start();		
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			santa.join();
		} catch (InterruptedException e) {
			System.out.println("An error occurred while waiting for threads to finish.");
		}

		System.out.println(" % : Done.");
	}
}
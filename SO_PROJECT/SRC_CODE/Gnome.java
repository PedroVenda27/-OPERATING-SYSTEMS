package tpisrc;

import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Gnome implements Runnable {
	private Stack<String> items;
	private String name;
	private String item;
	private int min = 1000;
	private int max = 2500;
	private boolean isLast;
	
	public Gnome (String name, Stack<String> items) {
		this.name = name;
		this.items = items;
		this.isLast = false;
	}
	
	public void run() { 
 
		completeTasks();
		
		getAnItem();
		
		goToSantasHouse();
		
		enterSantasHouse();
		
		goToTheLivingRoom();
		
		leaveSantasHouse();
		
		goHome();
	} 
	
	public void completeTasks() 
	{
		System.out.println(" # : " + name + " is completing its tasks!");
		
    	int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    	
        try {
			Thread.sleep(randomNum);
		} catch (InterruptedException e) {
			System.out.println(" ? : " + name + " | an error occurred while completing its tasks!");
		}
        
		System.out.println(" # : " + name + " completed its tasks!");
	}
	
	public void getAnItem()
	{
		item = items.pop();
		System.out.println(" # : " + name + " got item : [" + item + "]");
	}	
	
	public void goToSantasHouse()
	{
		System.out.println(" # : " + name + " went to Santa's house!");
		
    	int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    	
        try {
			Thread.sleep(randomNum);
		} catch (InterruptedException e) {
			System.out.println(" ? : " + name + " | an error occurred while going to Santa's house!");
		}
        
		System.out.println(" # : " + name + " arrived at Santa's house!");		
		
		if (isLast) {
			System.out.println(" # : " + name + " was the last one to arrive at Santa's house!");
			ringDoorbell();
		}
	}
	
	public void ringDoorbell() {
		System.out.println(" # : " + name + " rang the doorbell!");
	}
	
	public void enterSantasHouse() {
		System.out.println(" # : " + name + " entered Santa's house!");
		System.out.println(" # : " + name + " said hello to Santa!");
		System.out.println(" # : " + name + " gave the {" + item + "} to Santa!");
	}
	
	public void goToTheLivingRoom() {
		System.out.println(" # : " + name + " went into the living room and sat down!");
	}
	
	public void leaveSantasHouse() {
		System.out.println(" # : " + name + " left Santa' house!");

		if (isLast) {
			System.out.println(" # : " + name + " was the last one to arrive at Santa's house!");
			prepareSledge();
		}
	}		
	
	public void prepareSledge() {
		System.out.println(" # : " + name + " is preparing the Sledge!");
		
		min = 2500;
		max = 5000;
		
    	int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    	
        try {
			Thread.sleep(randomNum);
		} catch (InterruptedException e) {
			System.out.println(" ? : " + name + " | an error occurred while completing its tasks!");
		}
        
		System.out.println(" # : " + name + " prepared the Sledge and the Sledge is ready!");
	}	
	
	public void goHome() {
		System.out.println(" # : " + name + " went home!");
	}
}
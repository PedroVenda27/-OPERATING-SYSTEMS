package tpisrc;

import java.util.concurrent.ThreadLocalRandom;

public class Santa implements Runnable {
	private String name;
	private int min = 2500;
	private int max = 5000;
	
	public Santa (String name) {
		this.name = name;
	}
	
	public void run() {
		
		sleep();

		wakeup();
		
		openTheDoor();

		inviteGnomesIn();

		closeTheDoor();
		
		MeetWiththeGnomes();		

		sayGoodbyeToTheGnomes();
		
		waitingForTheSledgeToBeReady();

		handingOutGifts();
	}
	
	public void sleep() {
		System.out.println(" $ : " + name + " is sleeping!");
	}
	
	public void wakeup()
	{
		System.out.println(" $ : " + name + " woke up!");
	}	
	
	public void openTheDoor()
	{
		System.out.println(" $ : " + name + " opened the door!");
	}
	
	public void inviteGnomesIn()
	{
		System.out.println(" $ : " + name + " invited the first Gnome in.");
		System.out.println(" $ : " + name + " invited the second Gnome in.");
		System.out.println(" $ : " + name + " invited the third Gnome in.");
		System.out.println(" $ : " + name + " invited the fourth Gnome in.");
		System.out.println(" $ : " + name + " invited the fifth Gnome in.");
	}	
	
	public void closeTheDoor()
	{
		System.out.println(" $ : " + name + " closed the door!");
	}	
	
	public void MeetWiththeGnomes()
	{
		System.out.println(" $ : " + name + " went to meet and talk with the Gnomes!");
		
    	int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        try {
			Thread.sleep(randomNum);
		} catch (InterruptedException e) {
			System.out.println(" $ : " + name + " | an error occurred while completing its tasks!");
		}
        
		System.out.println(" $ : " + name + " finished talking with the Gnomes!");
	}	
	
	public void sayGoodbyeToTheGnomes() {
		System.out.println(" $ : " + name + " said goodbye to the Gnomes!");
	}
	
	public void waitingForTheSledgeToBeReady() {
		System.out.println(" $ : " + name + " is waiting for the Sledge to be ready!");
	}
	
	public void handingOutGifts()
	{
		System.out.println(" $ : " + name + " went to hand out gifts!");
	}	
}
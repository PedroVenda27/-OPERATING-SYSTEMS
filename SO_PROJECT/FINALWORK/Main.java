import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        final Semaphore doorbell = new Semaphore(0);
        final Semaphore santaReady = new Semaphore(0);
        final Semaphore gnomeReady = new Semaphore(0);
        final Semaphore meetingOver = new Semaphore(0);
        final Semaphore mutex = new Semaphore(1); // Semáforo para exclusão mútua

        Santa santa = new Santa(doorbell, santaReady, gnomeReady, meetingOver, mutex);
        Thread santaThread = new Thread(santa);
        santaThread.start();

        Gnome[] gnomes = new Gnome[5];
        Thread[] gnomeThreads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            gnomes[i] = new Gnome(i + 1, doorbell, santaReady, gnomeReady, meetingOver, mutex);
            gnomeThreads[i] = new Thread(gnomes[i]);
            gnomeThreads[i].start();
        }

        for (Thread gnomeThread : gnomeThreads) {
            try {
                gnomeThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            santaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

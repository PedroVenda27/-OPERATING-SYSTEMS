import java.util.concurrent.Semaphore;

public class Santa implements Runnable {
    private final Semaphore doorbell;
    private final Semaphore santaReady;
    private final Semaphore gnomeReady;
    private final Semaphore meetingOver;
    private final Semaphore mutex; // Semáforo para exclusão mútua

    public Santa(Semaphore doorbell, Semaphore santaReady, Semaphore gnomeReady, Semaphore meetingOver, Semaphore mutex) {
        this.doorbell = doorbell;
        this.santaReady = santaReady;
        this.gnomeReady = gnomeReady;
        this.meetingOver = meetingOver;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        try {
            System.out.println("Pai Natal: A dormir...");
            doorbell.acquire();
            System.out.println("Pai Natal: Ouvi a campainha! Acordando...");

            for (int i = 0; i < 5; i++) {
                System.out.println("Pai Natal: Convida Gnomo " + (i + 1) + " a entrar.");
                santaReady.release(); // Convida o gnomo a entrar
                gnomeReady.acquire(); // Espera o gnomo cumprimentar e se sentar
            }

            System.out.println("Pai Natal: Todos os gnomos estão dentro de casa.");
            System.out.println("Pai Natal: Fecha a porta.");
            System.out.println("Pai Natal: Inicia uma reunião.");
            Thread.sleep((long) (2500 + Math.random() * 2500));
            System.out.println("Pai Natal: A reunião acabou. Adeus, gnomos!");

            for (int i = 0; i < 5; i++) {
                meetingOver.release();
            }

            // Esperando o trenó estar pronto
            mutex.acquire();
            try {
                while (!Gnome.isSledReady()) {
                    System.out.println("Pai Natal: Esperando que o trenó esteja pronto...");
                    mutex.release();
                    Thread.sleep(500);
                    mutex.acquire();
                }
            } finally {
                mutex.release();
            }

            System.out.println("Pai Natal: Trenó está pronto!");
            System.out.println("Pai Natal: Indo entregar os presentes.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

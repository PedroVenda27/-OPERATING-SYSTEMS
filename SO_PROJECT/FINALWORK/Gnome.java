import java.util.concurrent.Semaphore;

public class Gnome implements Runnable {
    private final int id;
    private final Semaphore doorbell;
    private final Semaphore santaReady;
    private final Semaphore gnomeReady;
    private final Semaphore meetingOver;
    private final Semaphore mutex; // Semáforo para exclusão mútua
    private static int gnomesArrived = 0;
    private static boolean sledReady = false;
    private static int lastGnomeId = -1; // ID do último gnomo a chegar

    public Gnome(int id, Semaphore doorbell, Semaphore santaReady, Semaphore gnomeReady, Semaphore meetingOver, Semaphore mutex) {
        this.id = id;
        this.doorbell = doorbell;
        this.santaReady = santaReady;
        this.gnomeReady = gnomeReady;
        this.meetingOver = meetingOver;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        try {
            // Simular tempo de trabalho
            Thread.sleep((long) (1000 + Math.random() * 1500));
            System.out.println("Gnomo " + id + ": Terminei minha tarefa.");
            
            // Simular pegar um item da pilha
            System.out.println("Gnomo " + id + ": Pegando um item da pilha.");
            
            mutex.acquire();
            try {
                gnomesArrived++;
                lastGnomeId = id; // Registrar o último gnomo que chega
                System.out.println("Gnomo " + id + ": Indo para a casa do Pai Natal.");
                if (gnomesArrived < 5) {
                    System.out.println("Gnomo " + id + ": Aguardando os restantes gnomos.");
                } else {
                    System.out.println("Gnomo " + id + ": Todos os gnomos chegaram. Tocando a campainha.");
                    doorbell.release();
                }
            } finally {
                mutex.release();
            }

            santaReady.acquire();
            System.out.println("Gnomo " + id + ": Entrando na casa do Pai Natal.");
            System.out.println("Gnomo " + id + ": Cumprimentando o Pai Natal e se sentando.");
            gnomeReady.release();
            meetingOver.acquire();

            if (id == lastGnomeId) {
                System.out.println("Gnomo " + id + ": Ficando para preparar o trenó.");
                prepareSled();
                setSledReady(true);
            }

            System.out.println("Gnomo " + id + ": Saindo da casa do Pai Natal.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void prepareSled() throws InterruptedException {
        Thread.sleep((long) (2500 + Math.random() * 2500));
        System.out.println("Gnomo " + id + ": Trenó preparado.");
    }

    public static void setSledReady(boolean sledReady) {
        Gnome.sledReady = sledReady;
    }

    public static boolean isSledReady() {
        return sledReady;
    }
}

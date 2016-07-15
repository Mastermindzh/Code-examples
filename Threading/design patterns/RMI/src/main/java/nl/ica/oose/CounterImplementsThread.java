package nl.ica.oose;

/**
 * Created by janve on 24-2-2016.
 */
public class CounterImplementsThread implements Runnable {
    private boolean running;

    public void start(){
        Thread t1 = new Thread(this);
        t1.setDaemon(true);
        this.running = true;
        t1.start();
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean getRunning() {
        return running;
    }

    @Override
    public void run() {
        while (this.running) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
            }
        }
    }
}

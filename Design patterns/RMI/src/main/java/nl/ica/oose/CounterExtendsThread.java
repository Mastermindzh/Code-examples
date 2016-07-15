package nl.ica.oose;

/**
 * Created by janve on 24-2-2016.
 */
public class CounterExtendsThread extends Thread {
    private boolean running;

    public CounterExtendsThread() {
        this.setDaemon(true);
        this.running = true;
        this.start();
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run(){
        while (this.running) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
            }
        }
    }
}

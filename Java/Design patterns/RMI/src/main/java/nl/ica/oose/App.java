package nl.ica.oose;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Extends Thread
        /*
        CounterExtendsThread counter = new CounterExtendsThread();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        counter.setRunning(false);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        */
        //Implements interface runnable
        CounterImplementsThread counter = new CounterImplementsThread();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter.setRunning(false);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

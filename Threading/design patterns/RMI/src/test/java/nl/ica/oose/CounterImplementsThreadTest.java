package nl.ica.oose;

import junit.framework.TestCase;

/**
 * Created by janve on 24-2-2016.
 */
public class CounterImplementsThreadTest extends TestCase {

    public void testSetRunning() throws Exception {
        CounterImplementsThread counter = new CounterImplementsThread();
        counter.setRunning(false);
        assertEquals(counter.getRunning(),false);
    }

    public void testRun() throws Exception {
        CounterImplementsThread counter = new CounterImplementsThread();
        counter.run();
        counter.setRunning(false);
    }

    public void testStart() throws Exception{
        CounterImplementsThread counter = new CounterImplementsThread();
        counter.start();
    }
}
package nl.ica.oose;

import junit.framework.TestCase;

/**
 * Created by janve on 24-2-2016.
 */
public class SortServerTest extends TestCase {

    public void testStart() throws Exception {
        SortServer sortServer = new SortServer();
        sortServer.start();
    }
}
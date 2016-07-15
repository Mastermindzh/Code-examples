package nl.ica.oose;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;

/**
 * Created by janve on 24-2-2016.
 */
public class SortClientTest extends TestCase {

    public void testSortList() throws Exception {
        SortClient sortClient = new SortClient(new int[]{4,3,2,1});
        sortClient.sortList();
        int[] expectedArray = new int[]{1,2,3,4};
        Assert.assertArrayEquals(expectedArray, sortClient.getArray());
    }

    /*Server not availabe
    @Test(expected = RemoteException.class)
    public void testSortListRemoteExeption(){
        SortClient sortClient = new SortClient(new int[]{4,3,2,1});
        sortClient.sortList();
    }*/

    public void testArray() throws Exception{
        SortClient sortClient = new SortClient(new int[]{4,3,2,1});
        sortClient.printArray(sortClient.getArray());
    }


}
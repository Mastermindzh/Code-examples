package nl.ica.oose;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by janve on 24-2-2016.
 */
public class SorterTest extends TestCase {

    public void testSortIntList() throws Exception {
        Sorter sorter = new Sorter();
        int[] expectedArray = new int[]{1,2,3,4};
        Assert.assertArrayEquals(expectedArray, sorter.sortIntList(new int[]{4,3,2,1}));
    }
}
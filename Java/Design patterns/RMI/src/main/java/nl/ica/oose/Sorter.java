package nl.ica.oose;

import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.List;

/**
 * Created by janve on 24-2-2016.
 */
public class Sorter extends UnicastRemoteObject implements ISorter{
    protected Sorter() throws RemoteException {
        super();
    }

    public int[] sortIntList(int[] intList) throws RemoteException{
        Arrays.sort(intList);
        return intList;
    }
}

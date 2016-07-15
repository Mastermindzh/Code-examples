package nl.ica.oose;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by janve on 24-2-2016.
 */
public interface ISorter extends Remote {
    public int[] sortIntList(int[] intList) throws RemoteException;
}

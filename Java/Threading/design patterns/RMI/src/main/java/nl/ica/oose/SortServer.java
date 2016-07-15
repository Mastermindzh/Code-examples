package nl.ica.oose;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by janve on 24-2-2016.
 */
public class SortServer {

    public static void main(String[] args){
        SortServer sortServer = new SortServer();
        sortServer.start();
    }

    public void start(){
        try{
            ISorter sorter = new Sorter();
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("sorter", sorter);
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}

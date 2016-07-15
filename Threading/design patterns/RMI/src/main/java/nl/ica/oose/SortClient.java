package nl.ica.oose;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by janve on 24-2-2016.
 */
public class SortClient {

    private int[] array;

    public static void main(String[] args){
        SortClient sortClient = new SortClient(new int[]{1,2,434,435,2,2,6,53,52,32});
    }

    public int[] getArray() {
        return array;
    }

    public SortClient(int[] array) {
        this.array = array;
    }

    public void printArray(int[] array){
        for (int item:array) {
            System.out.println(item);
        }
    }

    public void sortList(){
        try{
            Remote remoteSorter = Naming.lookup("sorter");
            if(remoteSorter instanceof ISorter){
                ISorter sorter = (ISorter) remoteSorter;
                this.array = sorter.sortIntList(this.array);
            }
        }catch (RemoteException  | MalformedURLException | NotBoundException e){
            e.printStackTrace();
        }
    }
}

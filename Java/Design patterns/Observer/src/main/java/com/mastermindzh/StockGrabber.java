package com.mastermindzh;

import com.mastermindzh.Interfaces.Observer;
import com.mastermindzh.Interfaces.Subject;

import java.util.ArrayList;


/**
 * Created by mastermindzh on 3/9/16.
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for(Observer o: observers){
            o.update(ibmPrice,aaplPrice,googPrice);
        }
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public double getAaplPrice() {
        return aaplPrice;
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}

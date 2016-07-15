package com.mastermindzh;

import com.mastermindzh.Interfaces.Observer;
import com.mastermindzh.Interfaces.Subject;

/**
 * Created by mastermindzh on 3/9/16.
 */
public class StockObserver implements Observer{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;


    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }

    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printPrices();

    }

    private void printPrices(){
        System.out.println(observerID);
        System.out.println("IBM "+ ibmPrice);
        System.out.println("aapl "+ aaplPrice);
        System.out.println("goog "+ googPrice);

    }
}

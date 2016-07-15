package com.mastermindzh;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(100);
        stockGrabber.setAaplPrice(110);
        stockGrabber.setGoogPrice(120);

    }
}

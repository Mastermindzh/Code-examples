package com.mastermindzh;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }
    public void start(){
        Dobbelsteen ds = new Dobbelsteen();
        DobbelsteenConsoleView dcv = new DobbelsteenConsoleView();
        DobbelsteenSwingView dsv = new DobbelsteenSwingView();
        ds.addObserver(dcv);
        ds.addObserver(dsv);
        ds.dobbel();
    }
}



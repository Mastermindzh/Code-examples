package com.mastermindzh;

import java.util.Random;

/**
 * Created by mastermindzh on 3/6/16.
 */
public class threadObject implements Runnable{


    String name;
    int millis;
    Random r = new Random();

    public threadObject(String name){
        setName(name);
        setMillis(getR().nextInt(1000));
    }

    public void run() {
        try{
            System.out.println(getName() + " is sleeping for " + getMillis() + "ms");
            Thread.sleep(getMillis());
            System.out.println(getName() + " wakes up");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMillis() {
        return millis;
    }

    public void setMillis(int millis) {
        this.millis = millis;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

}

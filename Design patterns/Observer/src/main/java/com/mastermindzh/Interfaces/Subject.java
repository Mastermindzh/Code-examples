package com.mastermindzh.Interfaces;

/**
 * Created by mastermindzh on 3/9/16.
 */
public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}

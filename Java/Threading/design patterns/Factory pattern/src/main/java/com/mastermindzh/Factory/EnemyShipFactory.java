package com.mastermindzh.Factory;

import com.mastermindzh.EnemyShip;
import com.mastermindzh.Ships.RocketEnemyShip;
import com.mastermindzh.Ships.UFOEnemyShip;

/**
 * Created by mastermindzh on 3/6/16.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType){
        EnemyShip newShip = null;

        switch(shipType){
            case "U":
                newShip = new UFOEnemyShip();
                break;
            case "R":
                newShip = new RocketEnemyShip();
                break;
        }
        return newShip;
    }

    private EnemyShipFactory(){}


    private static EnemyShipFactory myFactory;
    public static EnemyShipFactory getInstance(){
        if(myFactory == null){
            return  new EnemyShipFactory();
        }else{
            return myFactory;
        }
    }

}

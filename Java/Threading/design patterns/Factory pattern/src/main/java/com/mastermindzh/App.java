package com.mastermindzh;

import com.mastermindzh.Factory.EnemyShipFactory;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String userInput = "";
        boolean running = true;
        System.out.println("U = ufo | R = rocket | Q = quit");

        while (running){
            if(myScanner.hasNextLine()){

                userInput = myScanner.nextLine();

                if(userInput.equals("Q")){
                    running = false;
                }else{
                    EnemyShip shipToUse = EnemyShipFactory.getInstance().makeEnemyShip(userInput);
                    if(shipToUse != null){
                        doEnemyActions(shipToUse);
                    }else{
                        System.out.println("U and R are allowed");
                    }
                }
            }
        }
    }

    public static void doEnemyActions(EnemyShip enemyShip){
        enemyShip.displayEnemyShips();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}

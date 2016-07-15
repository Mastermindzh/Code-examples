package com.mastermindzh;

/**
 * Created by mastermindzh on 3/6/16.
 */
public abstract class EnemyShip {
    String name;
    double damage;

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero ship");
    }

    public void displayEnemyShips(){
        System.out.println(getName() + " is visible on the screen");
    }
    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamage() + " to the hero");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}

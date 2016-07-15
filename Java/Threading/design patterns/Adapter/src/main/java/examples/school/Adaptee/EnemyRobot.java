package examples.school.Adaptee;

import examples.school.EnemyAttacker;

import java.util.Random;

/**
 * Created by mastermindzh on 3/6/16.
 */
public class EnemyRobot {

    Random rnd = new Random();

    public void smashWithHands() {
        System.out.println("Enemy Robot smashes for " + (rnd.nextInt(10) + 1) + " damage.");
    }

    public void walkForward() {
        System.out.println("Enemy robot walks " + (rnd.nextInt(3) + 1) + " spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot kills " + driverName + ".");
    }

}

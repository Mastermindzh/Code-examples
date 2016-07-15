package examples.school;

import java.util.Random;

/**
 * Created by mastermindzh on 3/6/16.
 */
public class EnemyTank implements EnemyAttacker{

    Random rnd = new Random();


    public void fireWeapon() {
        System.out.println("Enemy tank does " + (rnd.nextInt(10)+1) + " damage.");
    }

    public void driveForward() {
        System.out.println("Enemy tank has moved " + (rnd.nextInt(5)+1) + " spaces");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");

    }
}

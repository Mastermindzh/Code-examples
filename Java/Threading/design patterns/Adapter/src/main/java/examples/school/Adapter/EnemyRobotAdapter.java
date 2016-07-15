package examples.school.Adapter;

import examples.school.Adaptee.EnemyRobot;
import examples.school.EnemyAttacker;

/**
 * Created by mastermindzh on 3/6/16.
 */
public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot myRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){
        myRobot = newRobot;
    }


    public void fireWeapon() {
        myRobot.smashWithHands();
    }

    public void driveForward() {
        myRobot.walkForward();
    }

    public void assignDriver(String driverName) {
        myRobot.reactToHuman(driverName);
    }
}

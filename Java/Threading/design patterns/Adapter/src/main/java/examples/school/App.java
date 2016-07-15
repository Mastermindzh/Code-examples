package examples.school;

import examples.school.Adaptee.EnemyRobot;
import examples.school.Adapter.EnemyRobotAdapter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EnemyTank  tanky = new EnemyTank();
        EnemyRobot robby = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robby);

        System.out.println("Tank actions:");
        tanky.assignDriver("Penelope");
        tanky.driveForward();
        tanky.fireWeapon();

        System.out.println();

        System.out.println("Tank actions:");
        robotAdapter.assignDriver("Penelope");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}

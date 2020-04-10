import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * This class is for controling the speed of the robot depending on the colors of a traffic light
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-03)
 */
public class TeamProject_1
{
    static double speed;
    public static void main(String[] args) {
        String signal;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Select traffic light from green, yellow, or red:");
            signal = scan.next();
            if (!(signal.equals("green") || signal.equals("yellow") || signal.equals("red"))) {
                System.out.println("Select from green, yellow, red. Type again");
                continue;
            }
            
            System.out.println("Select your robot's speed:");
            try {
                speed = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please input a number");
                scan.next();
                continue;
            }
            if (speed <= 0) {
                System.out.println("Please set the robot's speed as positive to make it move");
                continue;
            }
            
            RobotWalk(signal, speed);
            System.out.println("traffic light:" + signal + ", speed:" + speed);
        }
    }
    public static void RobotWalk(String signal, double speed) {
        if (signal.equals("green")) { 
        } else {
            if (signal.equals("yellow")) {
                TeamProject_1.speed = speed * 1.2;
            } else {
                TeamProject_1.speed = 0;
            }
        }
    }
}


import java.util.*;
/**
 * This class is for a main method which conducts a robotwalk test.
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-03)
 */
public class RobotTest
{
    public static void main(String[] args) {
        String signal; // 신호등(녹색, 황색, 적색)
        
        Scanner scan = new Scanner(System.in);
        Robot robot = new Robot();
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
                robot.speed = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please input a number");
                scan.next();
                continue;
            }
            if (robot.speed <= 0) {
                System.out.println("Please set the robot's speed as positive to make it move");
                continue;
            }
            
            robot.RobotWalk(signal, robot.speed); // 인수(신호등 색깔, 로봇의 속도)
            System.out.println("traffic light:" + signal + ", speed:" + robot.speed);
        }
    }
}

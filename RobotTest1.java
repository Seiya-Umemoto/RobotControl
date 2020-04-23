import java.util.*;
/**
 * This class is for a main method which conducts a robotwalk test.
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-24)
 */
public class RobotTest1
{
    public static void main(String[] args) {
        String signal = "yellow"; // 신호등(녹색, 황색, 적색)
        double speed = 30.0;
        double estimated_speed = 36.0;

        Robot robot = new Robot();
        double after_speed = robot.RobotWalk(signal, speed); // 인수(신호등 색깔, 로봇의 속도)
        System.out.println("initialized speed: " + speed);
        System.out.println("estimated speed: " + estimated_speed);
        System.out.println("traffic light:" + signal + ", after_speed:" + after_speed);
        if (estimated_speed == after_speed) {
           System.out.println("Test OK");
        } 
    }        
}

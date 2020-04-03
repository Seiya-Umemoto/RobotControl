
/**
 * This class is for controling the speed of the robot depending of the colors of a traffic light
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-03)
 */
public class TeamProject_1
{
    public static void main(String[] args) {
        String signal = args[0];
        double speed = Double.parseDouble(args[1]);
        while (true) {
            speed = RobotWalk(signal,speed);
            if (speed == -1) {
                System.out.println("Please input a signal name again");
                continue;
            } else {
                System.out.println("traffic light:" + signal + " speed:" + speed);
                break;
            }
        }
    }
    public static double RobotWalk(String signal, double speed) {
        if (signal == "green") {
            return speed;
        } else {
            if (signal == "yellow") {
                return speed * 1.2;
            } else if (signal == "red") {
                return 0;
            }
        }
        // If the input is other than the colors of a traffic light
        return -1;
    }
}


/**
 * This class is for controling the speed of the robot depending of the colors of a traffic light
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-03)
 */
public class TeamProject_1
{
    public static void main(String[] args) {
        String signal;              //변수선언: 교통신호
        double speed;               //변수선언: 로봇의 현재속도
        while (true) {
            double speed = RobotWalk(args[0],Double.parseDouble(args[1]));  //메소드 선언
            if (speed == -1) {
                System.out.println("Please input a signal name again");
                continue;
            } else {
                System.out.println("traffic light:" + args[0] + " speed:" + speed);
                break;
            }
        }
    }
    public static double RobotWalk(String signal, double speed) {
        if (signal == "green") {  //조건1
            return speed;
        } else {
            if (signal == "yellow") {  //조건2
                return speed * 1.2;
            } else if (signal == "red") {  //조건3
                return 0;
            }
        }
        // If the input is other than the colors of a traffic light
        return -1;
    }
}

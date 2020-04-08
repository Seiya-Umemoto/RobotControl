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
    public static void main(String[] args) {
        String signal;                                                                              //변수선언1 Signal
        double speed;                                                                               //변수선언2 Speed
        Scanner scan = new Scanner(System.in);                                                      //Scanner Package scan 변수 선언
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Select traffic light from green, yellow, or red:");
            signal = scan.next();
            if (!(signal.equals("green") || signal.equals("yellow") || signal.equals("red"))) {     //만약 입력받은 신호가 초록,노랑,빨강이 아니라면
                System.out.println("Select from green, yellow, red. Type again");                   //재입력
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
            if (speed <= 0) {                                                                   //예외처리: 입력받은 스피드가 0보다 작다면
                System.out.println("Please set the robot's speed as positive to make it move");
                continue;
            }
            
            speed = RobotWalk(signal,speed);                                                    //
            System.out.println("traffic light:" + signal + ", speed:" + speed);
            continue;
        }
    }
    public static double RobotWalk(String signal, double speed) {
        if (signal.equals("green")) {       //조건1: 교통신호가 녹색이라면
            return speed;                   //속도를 변경하지 않고 보행
        } else {
            if (signal.equals("yellow")) {  //조건2: 교통신호가 노란색이라면
                return speed * 1.2;         //속도를 증가하여 보행
            } else {                        //조건3: 교통신호가 빨간색이라면
                return 0;                   //정지
            }
        }
    }
}

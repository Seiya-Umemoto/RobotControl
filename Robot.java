
/**
 * This class is for controling the speed of the robot depending on the colors of a traffic light
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-22)
 */
public class Robot
{
    
    public double RobotWalk(String signal, double speed)
    {
        
        if (signal.equals("green")){     //아무 실행도 안하고 넘어감
        }else{
            if (signal.equals("yellow")){
                speed = speed*1.2;
            }
            else {
                speed = 0.0;
            }
        } 
        return speed;
    }
}



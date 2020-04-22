
/**
 * This class is for controling the speed of the robot depending on the colors of a traffic light
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-03)
 */
public class Robot
{
    private double speed;
    private String signal;
    
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void setSignal(String signal){
        this.signal = signal;
    }
    public double getSpeed(){
        return this.speed;
    }
    public String getSignal(){
        return this.signal;
    }
    
    public double RobotWalk(String signal, double speed)
    {
        if (this.signal.equals("green")){     //아무 실행도 안하고 넘어감
        }else{
            if (this.signal.equals("yellow")){
                speed = this.speed*1.2;
            } else {
                speed = 0;
            }
        } 
        return speed;
    }
}



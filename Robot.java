
/**
 * This class is for controling the speed of the robot depending on the colors of a traffic light
 * 
 * @author (우메모토세이야_2018315056, 이재근_2015225129) 
 * @version (2020-04-03)
 */
public class Robot
{
<<<<<<< HEAD
    public double RobotWalk(String signal, double speed) {
        if (signal.equals("green")) { // 아무 실행도 안하고 넘어감.
        } else {
            if (signal.equals("yellow")) {
                speed = speed * 1.2; // 로봇의 속도를 20% 증가시킴.
=======
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
>>>>>>> d8bbaf913a5fcbfc8f805c4867e0431bae4e425d
            } else {
                speed = 0;
            }
<<<<<<< HEAD
        }
=======
        } 
>>>>>>> d8bbaf913a5fcbfc8f805c4867e0431bae4e425d
        return speed;
    }
}



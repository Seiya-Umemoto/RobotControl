
/**
 * 여기에 Robot 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Robot
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
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

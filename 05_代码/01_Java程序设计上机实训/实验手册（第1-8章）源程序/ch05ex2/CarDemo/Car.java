public class Car{
    private String ownerName;
    private float curSpeed;
    private float curDirInDegree;
    
    public Car(String ownerName){
      this.ownerName = ownerName;
    }
    public Car(String ownerName,float curSpeed,float curDirInDegree){
      this.ownerName = ownerName;
      this.curSpeed = curSpeed;
      this.curDirInDegree = curDirInDegree;
    }
    
    public String getOwnerName(){
      return ownerName;
    }
    public float getCurDirInDegree(){
      return curDirInDegree;
    }
    public float getCurSpeed(){
      return curSpeed;
    }
    public void changeSpeed(float curSpeed){
      this.curSpeed = curSpeed;
    }
    public void stop(){
      this.curSpeed = 0;
    }
}
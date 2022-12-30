package NFS;

public class NeedForSpeed {
    private int batteryDrain;
    private int speed;
    private int distance = 0;
    private int battery = 100;

    public NeedForSpeed(int batteryDrain, int speed) {
        this.batteryDrain = batteryDrain;
        this.speed = speed;
    }

    public void drive(){
        this.battery-=batteryDrain;
        this.distance+=speed;
    }

    public boolean batteryDrained(){
        if(this.battery<=0){
            return true;
        }else {
            return false;
        }
    }
}

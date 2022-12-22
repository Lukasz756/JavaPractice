public class ElonsToyCar {

    private int distance;
    private int battery;

    public ElonsToyCar(int distance, int battery) {
        this.distance = distance;
        this.battery = battery;
    }

    public static ElonsToyCar buy(){

        return new ElonsToyCar(0,1);
    }

    public int distanceDisplay(){
        return this.distance;
    }

    public int batteryDisplay(){
        return this.battery;
    }

    public void drive(){

        if(this.battery==0){
            System.out.println("Batter empty!");
        }else{
            this.battery -=1;
            this.distance +=20;
        }

    }

}

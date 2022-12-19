public class Lasagna {



    public Lasagna() {
    }

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutes){
        return expectedMinutesInOven()-minutes;
    }

    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    public int totalTimeInMinutes(int layers,int minutes){
        return (2*layers)+expectedMinutesInOven()-minutes;
    }

}

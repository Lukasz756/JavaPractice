public class BirdWatcher {

    private int[] lastWeek;

    public BirdWatcher(int[] lastWeek) {
        this.lastWeek = lastWeek;
    }

    public int[] getLastWeek(){
        return lastWeek;
    }

    public int getToday(int[] birds){

        return birds[birds.length-1];
    }

    public void incrementTodaysCount(int[] birds){

    }

}

public class Hamming {

    public static int hammingDistance(String firstString, String secondString){
        char[] firstChars = firstString.toCharArray();
        char[] secondChars  = secondString.toCharArray();
        int counter = 0;
        int distance = 0;
        for(char ch:firstChars){
            if(ch!=secondChars[counter]){
                distance++;
            }else{

            }
            counter++;
        }
        return distance;
    }
}

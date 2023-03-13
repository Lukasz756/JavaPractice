package Change;

import java.util.HashMap;
import java.util.Map;

public class Change {
    public static void main(String[] args) {
        System.out.println(getChange(200, 164));

    }
    public static Map<Integer,String> getChange(int payment,int cost){
        //[1,5,10,25,100]
        Map<Integer, String> changeMap = new HashMap<>();
        int change = payment-cost;
        System.out.println(change);
            Integer count25 = 0;
            Integer count10 = 0;
            Integer count100 = 0;
            Integer count5 =0;
            Integer count1 = 0;
        while(change-100>0){
            count100++;
            cost-=100;
        }

        changeMap.put(100,count100.toString());
        while(change-25>0){
            count25++;
            change-=25;
        }
        changeMap.put(25,count25.toString());
        while(change-10>0){
            count10++;
            change-=10;
        }
        changeMap.put(10,count10.toString());
        while(change-5>0){
            count5++;
            change-=5;
        }
        changeMap.put(5,count5.toString());
        while(change-1>=0){
            count1++;
            change-=1;
        }
        changeMap.put(1,count1.toString());



        return changeMap;
    }
}

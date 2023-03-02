package havker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class hacker {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(4,-3,-5,0,2,1);
        System.out.println(maxMagicSums(integerList));

    }
    public static int maxMagicSums(List<Integer> arr) {
        // Write your code here
        boolean sorting = false;
        int temp = 0;

        List<Integer> collect = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
        int counter =0;
        int numberOfGreater = 0;
        int[] msum = new int[arr.size()];
        for(int magicNumber:msum){
            for(int i = 0;i<counter;i++){
                magicNumber += arr.get(i);

            }
            if(magicNumber>0){
                numberOfGreater++;
            }
            counter++;
List<Integer> list = new ArrayList<>();
        }

        return numberOfGreater;
    }


}


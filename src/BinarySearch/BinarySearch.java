package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {
        int[] integers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] integersSorted = new int[integers.length];

        for (int num:integers
             ) {
            System.out.println(num);
        }
        System.out.println(integers.length);
        System.out.println(integersSorted.length);
        int search = 4;
        int temp;
        int middle;
        int found = 0;
        int top = integers.length;
        int bottom = 0;
        boolean searching = true;
        boolean sorting = true;
        List<Integer> integerList = new ArrayList<>();
        for (int number:
             integers) {
            integerList.add(number);
        }

        List<Integer> integerListSorted = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(integerListSorted);

        while(sorting) {
            sorting = false;
            for(int i =0;i< integers.length-1;i++){
                if(integers[i]>integers[i+1]){
                    temp = integers[i];
                    integers[i] = integers[i+1];
                    integers[i+1] = temp;
                    sorting =true;
                }
            }

        }
        for (int num:integers
        ) {
            System.out.println(num);
        }

        while(searching){
            System.out.println("Searching");
           if(top>=bottom){
               middle = (int) Math.floor((top+bottom)/2);
               System.out.println(middle);
               if(integers[middle-1]<search){
                   bottom = middle+1;
               }else if(integers[middle-1]>search){
                   top = middle-1;
               }else {
                   found = middle;
                   searching = false;
               }
           }

        }
        System.out.println("Number found: " + found);
    }
}

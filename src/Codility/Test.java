package Codility;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public String Solution3 (String S){
        int length = S.length();
        char[] chars = S.toCharArray();
        char[] chars1 = new char[chars.length-1];
        int i = 0;
        List<String> stringList = new ArrayList<>();

        for(char ch:chars){
            for(int j = 0;j<chars.length-1;j++){
                if(j==i){

                }else {
                    chars1[j] = chars[j];
                }
            }
            stringList.add(chars1.toString());
            i++;
        }
        List<String> collect = stringList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(collect);
        return collect.get(1);

    }

    public int solution(int[] A) {
        Arrays.sort(A);
        List<Integer> list = new ArrayList<>();
        for (Integer i:
                A) {
            list.add(i);

        }

        int number =0;
        int i = 0;
        // Implement your solution here
        for(i=0;i<=A.length;i++){
            if(i>0){
                if(list.contains(i)){

                }else {
                    if(number!=0){

                    }else{
                        number = i;
                    }}
            }

        }
        if(number==0){
            number=i;
        }
        return number;
    }

    public int solution2 (int N, int K){
        int first,second,third;
        first = (N/100)%10;
        second = (N/10)%10;
        third = N%10;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        while(K>0){
            while (first<9&&K>0){
                first+=1;
                K-=1;
            }
            while (second<9&&K>0){
                second+=1;
                K-=1;
            }
            while (third<9&&K>0){
                third+=1;
                K-=1;
            }

        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        return Integer.valueOf(first+""+second+""+third);
    }


}

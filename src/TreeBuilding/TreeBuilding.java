package TreeBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class TreeBuilding {
    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;

        List<String> dataList = Arrays.asList(
                "child1 (ID: 1, parent ID: 0)",
                "grandchild3 (ID: 6, parent ID: 3)",
                "grandchild2 (ID: 4, parent ID: 1)",
                "child2 (ID: 3, parentID: 0)",
                "grandchild1 (ID: 2, parent ID: 1)",
                "root (ID: 0, parent ID: 0)",
                "child3 (ID: 5, parent ID: 0)");
        int[][] ids = new int[dataList.size()][2];
        for(String str:dataList){
            String[] matches = Pattern.compile(" \\d").matcher(str).results().map(MatchResult::group).toArray(String[]::new);
            for(String str2: matches){
                System.out.println(Integer.parseInt(str2.substring(1)));
                if(counter2==0){
                    ids[counter][0]= Integer.parseInt(str2.substring(1));
                    counter2++;
                }else{
                    ids[counter][1] = Integer.parseInt(str2.substring(1));
                    counter2=0;
                    counter++;
                }

            }


            //System.out.println(Integer.valueOf(Arrays.toString(matches)));


        }
        //todo sort it all

        for(int[] id:ids){
            System.out.println(id[0]+" "+ id[1]);

//            for(int idd: id){
//                System.out.println(idd);
//            }
        }

        for(int i =0;i<ids.length-1;i++){
            int[] tempids = null;
            if(ids[i][0]>ids[i+1][0]){
                tempids = ids[i+1];
                ids[i+1] = ids[i];
                ids[i]=tempids;
                i=0;
            }
            if(ids[i][0]==ids[i+1][0]){
                if(ids[i][1]>ids[i+1][1]){
                    tempids = ids[i+1];
                    ids[i+1] = ids[i];
                    ids[i]=tempids;
                    i=0;
                }else{

                }
            }

        }

        System.out.println();
        for(int[] id:ids){
            System.out.println(id[0]+" "+ id[1]);

//            for(int idd: id){
//                System.out.println(idd);
//            }
        }
    }
}

import java.util.HashMap;
import java.util.List;

public class WordCount {

    public void counting(String quote){
        String strArray[] = quote.split(" ");
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        for (String str:strArray){
            if(words.containsKey(str)){
                words.replace(str,words.get(str),words.get(str)+1);
            }else{
                words.put(str,1);


            }
        }
        System.out.println(words.keySet());
        System.out.println(words.values());
    }

}

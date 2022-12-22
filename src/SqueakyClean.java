import java.util.Locale;
import java.util.regex.Pattern;

public class SqueakyClean {

    public static String clean(String str){
        char[] chars = str.toCharArray();
        int i = 0;
        for(char ch: chars){

            if(ch==' '){
                chars[i]='_';
            }
            i++;
        }
        String response = String.valueOf(chars);
        return response;
    }

    public static String clean3(String str){
        String response = Pattern.compile("-(.)").matcher(str).replaceAll(mr -> mr.group(1).toUpperCase());
        return response;
    }

}

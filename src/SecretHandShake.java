import java.util.ArrayList;

public class SecretHandShake {

    public void decode(int secret) {
        ArrayList<String> arrayList = new ArrayList<String>();

        String s = Integer.toBinaryString(secret);

        char[] chars = s.toCharArray();
        int counter = 0;

            if (chars[0] == '1') {
                arrayList.add("wink");
            }
            if (chars.length>1) {
                if(chars[1] == '1'){
                    arrayList.add("double blink");
                }

            }
            if (chars.length>2) {
                if(chars[2] == '1'){
                    arrayList.add("close your eyes");
                }
            }
            if (chars.length>3) {
                if(chars[3] == '1'){
                    arrayList.add("jump");
                }
            }


        System.out.println(arrayList);
    }
}


public class RotationalCipher {
    //97-122
    public String rotate(String str,int key){
        char[] strChars = str.toCharArray();
        char[]  rotatedChars = new char[strChars.length];
        int i = 0;
        for(char ch:strChars){
            rotatedChars[i] = (char) (strChars[i]+key);

            i++;
        }
        return String.valueOf(rotatedChars);
    }
}

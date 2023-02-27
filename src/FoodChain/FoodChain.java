package FoodChain;

import java.io.*;

public class FoodChain {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("FoodChainResource.txt"));
        while (bufferedReader.readLine() != null) {
            System.out.println(bufferedReader.readLine());
        }
    }
}

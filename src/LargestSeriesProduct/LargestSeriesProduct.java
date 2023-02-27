package LargestSeriesProduct;

public class LargestSeriesProduct {
    public static void main(String[] args) {
        System.out.println(checkLargestProduct("129536", 2));
    }

    public static int checkLargestProduct(String numbers, int length){
        int right = length;
        int counter = 0;
        int left = 0;
        int product=1;
        int largestProduct = 0;
        char[] numbersChars =  numbers.toCharArray();
        int[] ints = new int[numbers.length()];
        for(char ch:numbersChars){
            ints[counter] =  Character.getNumericValue(ch);
            counter++;
        }
        while(right<=ints.length) {
            product=1;

            for(int i = left;i<right;i++) {
                product=product*ints[i];
               System.out.println("Product: "+ product);

            }
            if(product>largestProduct){
                largestProduct = product;


            }else{

            }
            right++;
            left++;
        }

        return largestProduct;
    }

}

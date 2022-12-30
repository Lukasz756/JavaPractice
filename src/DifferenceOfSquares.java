import java.util.ArrayList;

public class DifferenceOfSquares {

    public void diff(int n){
        int sum=0;
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for(int i = 0;i<=n;i++){
            sum = sum + i;
            squares.add(Integer.valueOf(i*i));
        }
        int sumSquares=0;
        for(Integer number: squares){
            sumSquares+=number;
        }
        System.out.println(sum*sum);
        System.out.println(sumSquares);
        System.out.println((sum*sum)-sumSquares);
    }
}

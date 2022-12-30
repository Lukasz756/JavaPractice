import java.util.Arrays;

public class Triangle {
    public void determineTriangle(int sideA,int sideB, int sideC) throws Exception {

        checkIfTriangle(sideA,sideB,sideC);
        checkEquilateral(sideA,sideB,sideC);
        checkIsosceles(sideA,sideB,sideC);
        checkScalene(sideA,sideB,sideC);


    }

    private boolean checkIfTriangle(int sideA,int sideB, int sideC) throws Exception{
        int[] sides = new int[] {sideA,sideB,sideC};
        Arrays.sort(sides);
        if(sideA<=0||sideB<=0||sideC<=0){
           throw new Exception();
        }
        if(sides[0]+sides[1]<=sides[2]){
            throw new Exception();
        }else{
            return true;
        }
    }

    private boolean checkEquilateral (int sideA,int sideB, int sideC){
        if(sideA==sideB&&sideB==sideC){
            System.out.println("Triangle is Equilateral.");
            return true;
        }else {
            return false;
        }
    }

    private boolean checkIsosceles(int sideA,int sideB, int sideC){
        int[] sides = new int[] {sideA,sideB,sideC};
        Arrays.sort(sides);
        if(sides[0]==sides[1]||sides[1]==sides[2]){
            System.out.println("Triangle is Isosceles.");
            return true;
        }else {
            return false;
        }
    }
    private boolean checkScalene(int sideA,int sideB, int sideC){
      if(!checkIsosceles(sideA,sideB,sideC)&&!checkEquilateral(sideA,sideB,sideC)){
          System.out.println("Triangle is Scalene.");
          return true;
      }else{
          return false;
      }
    }


}

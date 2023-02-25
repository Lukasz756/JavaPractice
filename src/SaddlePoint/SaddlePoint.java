package SaddlePoint;

import java.util.ArrayList;

public class SaddlePoint {
    public int matrixSolver(int[][] matrix){
        System.out.println("solving");
        ArrayList<Integer> rows = new ArrayList<>();
        int i,j=0;
    int sumRow = 0;
        for(i =0;i<matrix.length;i++){

            sumRow=0;
            for(j = 0;j<matrix[i].length;j++){
            sumRow += matrix[i][j];

            }
            rows.add(sumRow);
            System.out.println(sumRow);
        }
        System.out.println(rows);

        for(i =0;i<matrix.length;i++){

            for(j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]>rows.get(i)-matrix[i][j]){
                    System.out.println("Saddle point: " +i + "x"+j);
                }else {

                }
            }

        }

        return 2;
    }
}

package StriversSDE.Arrays1;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);

        // Printing the modified matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] char1 = new boolean[m];
        boolean[] char2 = new boolean[n];

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j]==0){
                    char1[i]=true;
                    char2[j]=true;
                }
            }
        }

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(char1[i] || char2[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

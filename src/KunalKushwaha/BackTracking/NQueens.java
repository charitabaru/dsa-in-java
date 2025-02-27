package KunalKushwaha.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int N = 4;
        boolean[][] chess = new boolean[N][N];
        System.out.println(queens(chess,0));
    }

    public static int queens(boolean[][] chess, int row){
        if(row == chess.length){
            display(chess);
            System.out.println();
            return 1;
        }

        int count =0;
        //queen placement
        for(int col =0;col<chess.length;col++){
            if(isSafe(chess,row,col)){
                chess[row][col] = true;
                count += queens(chess,row+1);
                chess[row][col] = false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] chess, int row,int col){
        //up
        for (int i =0;i<row;i++){
            if(chess[i][col]){
                return false;
            }
        }

        //diagonal left
        int maxLeft = Math.min(row,col);
        for (int i =0; i<=maxLeft;i++){
            if(chess[row-i][col-i]){
                return false;
            }
        }

        //diagonal right
        int maxRight = Math.min(row,chess.length - col -1);
        for (int i =0; i<=maxRight;i++){
            if(chess[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    public static void display(boolean[][] chess){
        for(boolean[] row: chess){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

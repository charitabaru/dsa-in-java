package KunalKushwaha.BackTracking;

public class Nknights {
    public static void main(String[] args) {
        int n =4;
        boolean[][] chess =new boolean[n][n];
        knights(chess,0,0,4);
    }
    public static void knights(boolean[][] chess, int row,int col,int knights){
        if(knights == 0){
            display(chess);
            System.out.println();
            return;
        }


       if (row == chess.length){
           return;
       }

        if(col == chess.length){
            knights(chess,row+1,0,knights);
            return;
        }


        if(isSafe(chess,row,col)){
            chess[row][col] = true;
            knights(chess,row,col+1,knights-1);
            chess[row][col] = false;
        }

        knights(chess,row,col+1,knights);

    }

    public static boolean isSafe(boolean[][] chess, int row,int col){
        if(isValid(chess,row-1,col+2)){
            if(chess[row-1][col+2]){
                return false;
            }
        }
        if(isValid(chess,row-2,col+1)){
            if(chess[row-2][col+1]){
                return false;
            }
        }
        if(isValid(chess,row-2,col-1)){
            if(chess[row-2][col-1]){
                return false;
            }
        }
        if(isValid(chess,row-1,col-2)){
            if(chess[row-1][col-2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] chess, int row, int col){
        if(row>=0 && row< chess.length && col>=0 && col < chess.length){
            return true;
        }
        return false;
    }

    public static void display(boolean[][] chess){
        for(boolean[] row: chess){
            for(boolean element : row){
                if(element){
                    System.out.print("K ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

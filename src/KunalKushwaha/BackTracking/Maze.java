package KunalKushwaha.BackTracking;

public class Maze {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPaths("",board,0,0);
    }
    public static void allPaths(String p,boolean[][] board,int r,int c){
        if(r == board.length-1 && c == board[0].length-1){
            System.out.println(p);
            return;
        }

        //Skip the call if it is an obstacle
        if(!board[r][c]){
            return;
        }

        // I am considering this block in my path
        board[r][c] = false;

        if(r < board.length -1){
            allPaths(p + "D",board,r+1,c);
        }
        if(c <  board.length -1){
            allPaths(p + "R",board,r,c+1);
        }
        if(r>0){
            allPaths(p+'U',board,r-1,c);
        }
        if(c>0){
            allPaths(p+'L',board,r,c-1);
        }

        board[r][c] = true;
    }
}

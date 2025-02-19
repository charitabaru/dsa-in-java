package KunalKushwaha.MazeProblems;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathWithObstacle("",board,0,0);
    }
    public static void pathWithObstacle(String p,boolean[][] board,int r,int c){
        if(r == board.length-1 && c == board[0].length-1){
            System.out.println(p);
            return;
        }

        //Skip the call if it is an obstacle
        if(!board[r][c]){
            return;
        }

        if(r < board.length -1){
            pathWithObstacle(p + "D",board,r+1,c);
        }
        if(c <  board.length -1){
            pathWithObstacle(p + "R",board,r,c+1);
        }
    }
}

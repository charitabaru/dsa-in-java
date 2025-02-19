package KunalKushwaha.MazeProblems;

import java.util.ArrayList;

public class CountPaths {
    public static void main(String[] args) {
//        System.out.println(count(0,0));
//        printPaths("",0,0);
       ArrayList<String> ans = printPathsDiagonal("",0,0);
        System.out.println(ans);
    }
    public static int count(int row,int col){
        if(row == 2||col == 2 ){
            return 1;
        }
        int left = count(row+1,col);
        int right = count(row,col+1);
        return left + right;
    }

    //Printing Paths that maze take to reach goal
    public static void printPaths(String p,int r,int c){
        if(r == 2 && c == 2){
            System.out.println(p);
            return;
        }
        if(r < 2){
            printPaths(p + "D",r+1,c);
        }
        if(c < 2){
            printPaths(p + "R",r,c+1);
        }
    }
    //Printing paths including diagonal also
    public static ArrayList<String> printPathsDiagonal(String p, int r, int c){
        if(r == 2 && c == 2){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r <2 && c <2){
            list.addAll(printPathsDiagonal(p + "D",r+1,c+1));
        }
        if(r < 2){
            list.addAll(printPathsDiagonal(p + "V",r+1,c));
        }
        if(c < 2){
           list.addAll( printPathsDiagonal(p + "H",r,c+1));
        }
        return list;
    }

}

package KunalKushwaha.Recursion.Subsets;

import java.util.ArrayList;

public class GettingAllSubsets {
    public static void main(String[] args) {
        String str = "abc";
        subsetOfAll(" ",str);
        System.out.println(subsetOfAllList("",str));
    }
    public static void subsetOfAll(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        subsetOfAll(p+ch,str.substring(1));
        subsetOfAll(p,str.substring(1));
    }
    public static ArrayList<String> subsetOfAllList(String p, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String>  left = subsetOfAllList(p+ch,str.substring(1));
        ArrayList<String>  right = subsetOfAllList(p,str.substring(1));
        left.addAll(right);
        return left;
    }
}

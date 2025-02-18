package KunalKushwaha.Recursion.Permutations;

import java.util.ArrayList;

public class NoOfPermutationsList {
    public static void main(String[] args) {
//        permutations("","abc");
//        ArrayList<String>  ans = permutationsInLIst("","abc");
//        System.out.println(ans);
        System.out.println(permutationsCount("","abc"));
    }
    public static void permutations(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations( f + ch + s,str.substring(1));
        }
    }

    public static ArrayList<String> permutationsInLIst(String p, String str){
        if(str.isEmpty()){
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String>  ans = new ArrayList<>();
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsInLIst( f + ch + s,str.substring(1)));
        }
        return ans;
    }

    // Count the number of permutations are possible for given string
    public static int permutationsCount(String p,String str){
        if(str.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count += permutationsCount( f + ch + s,str.substring(1));
        }
        return count;
    }
}

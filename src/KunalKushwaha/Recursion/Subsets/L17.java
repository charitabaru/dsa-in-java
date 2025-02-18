package KunalKushwaha.Recursion.Subsets;

import java.util.ArrayList;

public class L17 {
    public static void main(String[] args) {
        dialPad("","12");
        ArrayList<String>  ans = dialPadList("","12");
        System.out.println(ans);
    }
    public static void dialPad(String p,String digits){
        if(digits.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = digits.charAt(0) -'0';

        for(int i = (digit -1) *3;i<digit*3;i++){
            char ch = (char) ('a'+i);
            dialPad(p+ch,digits.substring(1));
        }
    }

    public static ArrayList<String> dialPadList(String p, String digits){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = digits.charAt(0) -'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit -1) *3;i<digit*3;i++){
            char ch = (char) ('a'+i);
            list.addAll(dialPadList(p+ch,digits.substring(1)));
        }
        return list;
    }
}

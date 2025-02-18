package KunalKushwaha.Recursion.Subsets;

import java.util.ArrayList;
import java.util.List;

public class L17Approach2 {
    public static void main(String[] args) {
        System.out.println( letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        dialPad("", digits, ans);
        return ans;
    }

    public static void dialPad(String p, String digits, List<String> ans) {
        if(digits.isEmpty()) {
            ans.add(p);
            return;
        }

        int digit = digits.charAt(0) - '0';
        int start = 0;
        int len = 3;

        // 7 && 8 have 4 letters
        if(digit == 7 || digit == 9) {
            len = 4;
        }

        // Calculate starting position
        if(digit == 7) start = 15;        // pqrs
        else if(digit == 8) start = 19;   // tuv
        else if(digit == 9) start = 22;   // wxyz
        else if(digit >= 2) start = (digit - 2) * 3;  // for digits 2-6

        // Add each possible letter
        for(int i = start; i < start + len; i++) {
            char ch = (char)('a' + i);
            dialPad(p + ch, digits.substring(1), ans);
        }
    }
}

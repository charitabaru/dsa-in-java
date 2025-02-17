package KunalKushwaha.Recursion.Subsets;

public class SubSetASCII {
    public static void main(String[] args) {
        String str = "abc";
        subsetAscii("",str);
    }
    public static void subsetAscii(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        subsetAscii(p+ch,str.substring(1));
        subsetAscii(p,str.substring(1));
        subsetAscii(p+(ch + 0),str.substring(1));
    }
}

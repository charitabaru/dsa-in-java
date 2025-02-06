package KunalKushwaha.LinearSearch;

public class SearchInString {
        public static void main(String[] args) {
            String name = "Charitha";
            char target = 'p';
            boolean ans = charCheck(name,target);
            System.out.println(ans);
        }
        static boolean charCheck(String str,char target){
            if (str.isEmpty()){
                return false;
            }
            for (int index = 0; index < str.length(); index++){
                if (target == str.charAt(index)){
                    return true;
                }
            }
            return false;
        }
}


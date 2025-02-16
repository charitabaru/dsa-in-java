package KunalKushwaha.Recursion.Strings;

public class SkipAString {
    public static void main(String[] args) {
        String up = "bccapped";
        System.out.println(skipAppNotApple(up));
    }

    public static String skipApple(String up) {
        if (up.isEmpty()) {
            return " ";

        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    //This Function will skip the app string only if the string does not have the apple string if it
    //has the apple string then it returns the same

    public static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            //the begin index value is based on teh no.of chars at string
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}

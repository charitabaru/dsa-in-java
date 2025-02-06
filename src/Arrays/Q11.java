package Arrays;

public class Q11 {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}} ;
        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;
        for (String[] item : items) {
            switch (ruleKey) {
                case "type":
                    if (item[0].equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "color" :
                    if (item[1].equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "name":
                    if (item[2].equals(ruleValue)) {
                        count++;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(count);
    }
}

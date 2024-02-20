package technicalRoundQuestions.ThinkCore;

public class StringReverse {
    public static String reverse(String str){
        String res = "";
        int i = str.length() - 1;
        while(i >= 0){
            char c = str.charAt(i);
            res = res + c;
            i--;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("The original string is " + str);
        System.out.println("The reverse string is " + reverse(str));
    }
}

package technicalRoundQuestions.ThinkCore;

import java.util.Locale;

public class PalindromeString {
    public static String isPalindrome(String str){
        str = str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("\\s", "");
        String res = "";
        int i = str.length() - 1;
        while (i >= 0){
            char c = str.charAt(i);
            res = res + c;
            i--;
        }
        if(str.equals(res))
            return "is a palindrome";
        return "not a palindrome";
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(isPalindrome(str));
    }
}

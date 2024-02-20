package GFG;

public class PalindromeSentence {
    static boolean sentencePalindrome(String s) {
        // code here
        String res = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 120)
                res += s.charAt(i);
        }

        String reverse = "";

        for(int i = res.length() - 1; i >= 0; i--){
            reverse += res.charAt(i);
        }

        if(reverse.equals(res))
            return true;
        return false;
    }
    static boolean bestSolution(String s) {
        // code here
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
    public static void main(String[] args) {
        String s = "race car.";
//        System.out.println(sentencePalindrome(s));
        System.out.println(bestSolution(s));
    }
}

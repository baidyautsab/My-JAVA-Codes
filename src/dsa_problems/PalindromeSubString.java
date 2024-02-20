package dsa_problems;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSubString {
        public static void main(String[] args) {
            String input = "abbajkj";
            List<String> palindromeCombinations = findPalindromeCombinations(input);

            System.out.println("Palindrome Combinations:");
            for (String palindrome : palindromeCombinations) {
                System.out.println(palindrome);
            }
        }

        public static List<String> findPalindromeCombinations(String input) {
            List<String> palindromeCombinations = new ArrayList<>();

            for (int i = 0; i < input.length(); i++) {
                for (int j = i + 1; j <= input.length(); j++) {
                    String substring = input.substring(i, j);
                    if (isPalindrome(substring)) {
                        palindromeCombinations.add(substring);
                    }
                }
            }

            return palindromeCombinations;
        }

        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }

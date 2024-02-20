package number;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int num){
        int temp1 = num;
        int result = 0;
        while(temp1 > 0){
            int rim = temp1 % 10;
            result = result * 10 + rim;
            temp1 /= 10;
        }
        if(num == result)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " is palindrome " + isPalindrome(num));
    }
}

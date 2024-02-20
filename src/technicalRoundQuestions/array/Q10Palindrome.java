package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q10Palindrome {
    public static void print(int[] num){
        System.out.println("Prime elements are ");
        for(int i = 0; i < num.length; i++){
            if(isPalindrome(num[i]))
                System.out.print(num[i] + " ");
        }
    }
    public static boolean isPalindrome(int num){
        // 121 , 111
        int copy = num;
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }
        if(copy == result)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the elements ");
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }
        print(num);
        sc.close();
    }
}

package technicalRoundQuestions;

import java.util.Scanner;

public class Q12SpyNumber {
    public static boolean isSpy(int num){
        if(Q11SumAndProductOfDigits.digitProduct(num) == Q11SumAndProductOfDigits.digitSum(num))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " is a spyNumber : " + isSpy(num));
        sc.close();
    }
}

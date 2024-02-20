package technicalRoundQuestions;

import java.util.Scanner;

public class Q4EvenOdd {
    // without using %
    public static String check(int num){
        if((num ^ 1) > num)
            // first convert both number in binary
            // num = 2 -> 10 ^ 01 = 11 -> 3
            return "Even Number";
        else
            return "Odd Number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print(num + " is " + check(num));
        sc.close();
    }
}

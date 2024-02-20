package technicalRoundQuestions;

import java.util.Scanner;

public class Q1Factorial {
    public static long fact(long num){
        long result = 1;
        for(long i = num; i > 0; i--){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        long num = sc.nextLong();
        System.out.println("Factorial of " + num + " is " + fact(num));
        sc.close();
    }
}

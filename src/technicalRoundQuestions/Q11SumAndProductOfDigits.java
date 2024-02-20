package technicalRoundQuestions;

import java.util.Scanner;

public class Q11SumAndProductOfDigits {
    public static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            int rim = num % 10;
            sum += rim;
            num /= 10;
        }
        return sum;
    }
    public static int digitProduct(int num){
        int product = 1;
        while(num > 0){
            int rim = num % 10;
            product *= rim;
            num /= 10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Sum of digits of " + num + " is " + digitSum(num));
        System.out.println("Product of digits of " + num + " is " + digitProduct(num));
        sc.close();
    }
}

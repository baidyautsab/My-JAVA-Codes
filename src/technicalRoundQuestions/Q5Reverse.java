package technicalRoundQuestions;

import java.util.Scanner;

public class Q5Reverse {
    public static int reverse(int num){
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            result = result * 10 + rem;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print("Reverse of " + num + " is " + reverse(num));
        sc.close();
    }
}

package technicalRoundQuestions;

import java.util.Scanner;

public class Q8CountOfDigits {
    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Total digits present into the number is " + countDigits(num));
        sc.close();
    }
}

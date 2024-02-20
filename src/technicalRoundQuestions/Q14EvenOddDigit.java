package technicalRoundQuestions;

import java.util.Scanner;

public class Q14EvenOddDigit {
    public static void countDigit(int num){
        int countEven = 0, countOdd = 0, temp = num;
        while(num > 0){
            int rim = num % 10;
            if(rim % 2 == 0)
                countEven++;
            else
                countOdd++;
            num /= 10;
        }
        System.out.println("Even digit present in " + temp + " is " + countEven);
        System.out.println("Odd digit present in " + temp + " is " + countOdd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        countDigit(num);
        sc.close();
    }
}

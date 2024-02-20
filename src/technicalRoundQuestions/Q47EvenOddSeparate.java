package technicalRoundQuestions;

import java.util.Scanner;

public class Q47EvenOddSeparate {
    public static void separate(int num){
        String evenDigit = " ";
        String oddDigit = " ";
        int temp = num;
        while(num > 0){
            int rim = num % 10;
            if(rim % 2 == 0)
                evenDigit = rim + evenDigit;
            else
                oddDigit = rim + oddDigit;
            num /= 10;
        }
        System.out.println("Even digits present in " + temp + " are " + evenDigit);
        System.out.println("Odd digits present in " + temp + " are " + oddDigit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        separate(num);
        sc.close();
    }
}

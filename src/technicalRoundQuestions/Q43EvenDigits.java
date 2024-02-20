package technicalRoundQuestions;

import java.util.Scanner;

public class Q43EvenDigits {
    public static void printEven(int num){
        while(num > 0){
            int rim = num % 10;
            if(rim % 2 == 0)
                System.out.print(rim + " ");
            num = num / 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        printEven(num);
        sc.close();
    }
}

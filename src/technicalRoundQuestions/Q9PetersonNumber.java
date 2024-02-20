package technicalRoundQuestions;

import java.util.Scanner;

public class Q9PetersonNumber {
    public static boolean check(int num){
        int sumFact = 0;
        int temp = num;
        while(num > 0){
            int rim = num % 10;
            sumFact += Q1Factorial.fact(rim);
            num /= 10;
        }
        if(sumFact == temp)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " is a Peterson number : " + check(num));
    }
}

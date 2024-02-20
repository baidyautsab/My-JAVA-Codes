package technicalRoundQuestions;

import java.util.Scanner;

public class Q7LeapYearInRange {
    public static void print(int lower, int upper){
        for(int i = lower; i <= upper; i++){
            if(isLeapYear(i))
                System.out.print(i + " ");
        }
    }
    public static boolean isLeapYear(int i){
        if(i % 4 == 0)
            return true;
        else if(i % 100 == 0){
            if(i % 400 == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range ");
        int lower = sc.nextInt();
        System.out.print("Enter upper range ");
        int upper = sc.nextInt();
        print(lower, upper);
        sc.close();
    }
}

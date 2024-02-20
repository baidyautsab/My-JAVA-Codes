package technicalRoundQuestions;

import java.util.Scanner;

public class Q6LeapYear {
    public static boolean check(int year){
        if(year % 4 == 0)
            return true;
        else if(year % 100 == 0){ // year must be century type then
            if(year % 400 == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year ");
        int year = sc.nextInt();
        System.out.println(year + " is LeapYear : " + check(year));
        sc.close();
    }
}

package technicalRoundQuestions;

import java.util.Scanner;

public class Q29PerfectNumber {
    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i <= num /2; i++){
            if(num % i == 0)
                sum += i;
        }
        if(sum == num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num ");
        int num = sc.nextInt();
        System.out.println(num + " isPerfect number : " + isPerfect(num));
        sc.close();
    }
}

package technicalRoundQuestions;

import java.util.Scanner;

public class Q17CheckPrime {
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        if(num == 2 || num == 3)
            return true;
        if(num % 2 == 0 || num % 3 == 0)
            return false;
        else{
            for(int j = 5; j <= Math.sqrt(num); j++){
                if(num % j == 0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " is prime : " + isPrime(num));
        sc.close();
    }
}

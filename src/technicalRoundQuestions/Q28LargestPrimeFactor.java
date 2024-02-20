package technicalRoundQuestions;

import java.util.Scanner;

public class Q28LargestPrimeFactor {
    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        if(n == 2)
            return true;
        else{
            for(int i = 2; i <= n / 2; i++){
                if(n % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static int factor(int f){
        int prime = 0;
        for(int i = 1; i <= f; i++){
            if(f % i == 0)
                if(isPrime(i))
                    prime = i;
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num ");
        int num = sc.nextInt();
        System.out.println("Largest prime factor of " + num + " is " + factor(num));
        sc.close();
    }
}

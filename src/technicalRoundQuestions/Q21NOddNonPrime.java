package technicalRoundQuestions;

import java.util.Scanner;

public class Q21NOddNonPrime { // wrong
    public static int giveOddNP(int num){
        int count = 0;
        int last = 0;
        for(int i = 1; count < num; i++){
            if(isPrime(i)){
                count++;
                last = i;
            }
        }
        return last;
    }
    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        if(n == 2)
            return false;
        if(n % 2 == 0)
            return false;
        else{
            for(int i = 3; i <= Math.sqrt(n); i=i+2){
                if(n % i != 0)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number ");
        int num = sc.nextInt();
        System.out.println(num + "th odd non prime number is " + giveOddNP(4));
        sc.close();
    }
}

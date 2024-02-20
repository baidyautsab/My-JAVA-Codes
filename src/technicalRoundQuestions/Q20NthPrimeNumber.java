package technicalRoundQuestions;

import java.util.Scanner;

public class Q20NthPrimeNumber {
    public static int nthPrime(int num){
        int count = 0;
        int last = 0;
        for(int i = 1; count < num; i++){
            if(Q17CheckPrime.isPrime(i)){
                last = i;
                count++;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + "th prime number is " + nthPrime(num));
        sc.close();
    }
}

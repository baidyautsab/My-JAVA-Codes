package technicalRoundQuestions;

import java.util.Scanner;

public class Q18PrimeNumberWithInRange {
    public static void print(int num){
        for(int i = 1; i <= num; i++){
            if(Q17CheckPrime.isPrime(i))
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int num = sc.nextInt();
        print(num);
        sc.close();
    }
}

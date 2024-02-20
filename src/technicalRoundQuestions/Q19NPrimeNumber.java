package technicalRoundQuestions;

import java.util.Scanner;

public class Q19NPrimeNumber {
    public static void print(int num){
        int count = 0;
        for(int i = 1; count < num; i++){
            if(Q17CheckPrime.isPrime(i)){
                System.out.print(i + " ");
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number ");
        int num = sc.nextInt();
        print(num);
        sc.close();
    }
}

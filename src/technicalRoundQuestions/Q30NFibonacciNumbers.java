package technicalRoundQuestions;

import java.util.Scanner;

public class Q30NFibonacciNumbers {
    public static void print(int num){
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        for(int i = 1; i <= num - 1; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int range = sc.nextInt();
        print(range);
        sc.close();
    }
}

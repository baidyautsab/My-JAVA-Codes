package technicalRoundQuestions;

import java.util.Scanner;

public class Q34NthEvenFibonacciNumber {
    public static int evenFibonacci(int range){
        int n1 = 0;
        int n2 = 1;
        int count = 0;
        int result = 0;
        for(int i = 1; count <= range - 1; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(n3 % 2 == 0){
                result = n3;
                count++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int range = sc.nextInt();
        System.out.println(range + "th even fibonacci number is " + evenFibonacci(range));
        sc.close();
    }
}

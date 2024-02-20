package technicalRoundQuestions;

import java.util.Scanner;

public class Q31NthFibonacciNumber {
    public static int nthFibonacci(int range){
        int n1 = 0;
        int n2 = 1;
        int nth = 0;
        for(int i = 1; i <= range - 1; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            nth = n3;
        }
        return nth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int range = sc.nextInt();
        System.out.println(range + "th fibonacci number is " + nthFibonacci(range));
        sc.close();
    }
}

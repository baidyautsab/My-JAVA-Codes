package technicalRoundQuestions;

import java.util.Scanner;

public class Q32FibonacciNumberInN {
    public static void print(int range){
        int n1 = 0;
        int n2 = 1;
        System.out.print(n2 + " ");
            for (int i = 1; i <= range - 1; i++) {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                if(n3 > range)
                    return;
                System.out.print(n3 + " ");
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

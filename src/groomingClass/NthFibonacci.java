package groomingClass;

import java.util.Scanner;

public class NthFibonacci {
    public static int nthFibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int c = 1;
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
        while(c <= n){
            n3 = n1 + n2;
            c++;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        System.out.println(n + "th fibonacci number is : " + nthFibonacci(n));
    }
}

package myPackage;

import java.util.Scanner;

public class FibonacciSeries {
    // It is a series of numbers which one digit is sum of previous two digits
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,.......
    void printQ1(int num){
        int n1 = 0, n2 = 1;
        System.out.print(n1 +" "+ n2);
        for(int i = 1; i <= num - 2; i++){
            int n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }
    }
    void printQ2(int num){
        int n1 = 0, n2 = 1;
        for(int i = 1; i <= num - 2; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(i == num - 2){
                System.out.print(i+2+"th Fibonacci number is "+n3);
            }
        }
    }
    int printQ3(int num){
        int n1 = 0, n2 = 1, n3 = 0, sum = n1 + n2;
        for(int i = 1; i <= num - 2; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            sum = n3 + sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        FibonacciSeries f1 = new FibonacciSeries();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        f1.printQ1(num);
        //f1.printQ2(num);
        System.out.println("\nSum of "+ num +" Fibonacci series is "+ f1.printQ3(num));

        sc.close();
    }
}

package myPackage;

import java.util.Scanner;

public class Factorial {
    static long fact(int num){
        if(num == 0)
            return 1;
        long res = 1L;
            for (int i = num; i > 0; i--) {
                res = res * i;
            }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        if(num >= 0 && num <= 20) // the method return long type number, after 20 the output exceed the long limit
            System.out.print("Factorial of " + num + " is " + fact(num));
        else
            System.out.println("Enter number between 20.");

        sc.close();
    }
}

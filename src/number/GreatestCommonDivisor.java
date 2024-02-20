package number;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b){
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; i++){ // run the loop for both a and b simultaneously
            if(a % i == 0 && b % i == 0) // if both are divisible by same number than store the number in gcd
                gcd = i;
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        System.out.print("GCD of " + a + " and " + b + " is " + gcd(a,b));
        sc.close();
    }
}

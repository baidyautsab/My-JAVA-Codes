package number;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialUsingBigInteger {
    public static void print(int num){
        for(int i = 1; i <= num; i++){
            System.out.print(factorial(i) + " ");
        }
    }
    public static BigInteger factorial(int n){
        BigInteger b1 = BigInteger.ONE;
        for(int i = n; i >= 1; i--){
            b1 = b1.multiply(BigInteger.valueOf(i));
        }
        return b1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range ");
        int range = sc.nextInt();
        print(range);
        sc.close();
    }
}

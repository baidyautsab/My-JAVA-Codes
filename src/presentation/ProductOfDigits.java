package presentation;

import java.util.Scanner;

public class ProductOfDigits {
    public static long product(long num){
        long product = 1;
        while(num > 0){
            long res = num % 10;
            product = product * res;
            num = num / 10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        long num = sc.nextLong();
        System.out.println("Product of " + num + " is " + product(num));
        sc.close();
    }
}

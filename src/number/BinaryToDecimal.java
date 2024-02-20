package number;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int convertDecimal(long num){
        // 11001 % 10 = 1 || 1 * 2 ^ 0 + 0
        int res = 0;
        int i = 0;
        while (num > 0){
            int rem = (int) (num % 10);
            res = rem * pow(2, i) + res;
            i++;
            num = num / 10;
        }
        return res;
    }
    public static int pow(int base, int power){
        int res = 1;
        for(int i = 1; i <= power; i++){
            res = res * base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number ");
        long num = sc.nextLong();
        System.out.println("Decimal of " + num + " is " + convertDecimal(num));
        sc.close();
    }
}

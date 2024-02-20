package number;

import java.util.Scanner;

public class DecimalToBinary {
    public static long convertBinary(long num){
        // 25 = 11001
        // 25 % 2 = 1 || 1 * 10 ^ 1 + 0
        long res = 0L;
        int i = 0;
        while(num > 0){
            long rem = num % 2;
            res = rem * pow(10, i) + res;
            i++;
            num = num / 2;
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
        System.out.println("Enter a decimal number ");
        long num = sc.nextLong();
        System.out.println("Binary of " + num + " is " + convertBinary(num));
        sc.close();
    }
}

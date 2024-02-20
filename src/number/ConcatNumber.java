package number;

import java.util.Scanner;

public class ConcatNumber {
    public static long concat(long num1, long num2){
        int count = 0;
        long temp = num2;
        while (temp > 0){
            temp /= 10;
            count++;
        }
        long multiply = 10;
        if(count > 1){
            for(int i = 2; i <= count; i++){
                multiply *= 10;
            }
        }
        num1 *= multiply;
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 ");
        long num1 = sc.nextLong();
        System.out.print("Enter num2 ");
        long num2 = sc.nextLong();
        System.out.println("Marge of " + num1 + " and " + num2 + " is " + concat(num1, num2));
        sc.close();
    }
}

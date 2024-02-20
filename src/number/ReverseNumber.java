package number;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int num){
        int result = 0;
        while (num > 0){
            int rim = num % 10;
            result = result * 10 + rim;
            num = num / 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Reverse of " + num + " is " + reverse(num));
        sc.close();
    }
}

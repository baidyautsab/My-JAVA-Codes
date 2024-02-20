package number;

import java.util.Scanner;

public class DigitsOfNumber {
    public static int digits(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Digits of the number is " + digits(num));
    }
}

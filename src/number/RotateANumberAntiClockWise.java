package number;

import java.util.Scanner;

public class RotateANumberAntiClockWise {
    public static int rotate(int num, int no){
        // 1234 --> 2341
        int tempC = num, count = 0;
        while(tempC > 0){
            tempC /= 10;
            count++;
        }
        int result = 0, tempForLoop = num;
        for(int j = 1; j <= no; j++) {
            int divide = 1;
            if (count > 1) {
                for (int i = 1; i < count; i++) {
                    divide *= 10;
                } // 10 * 10 * 10 -> 1000
            }
            int remaining = tempForLoop % divide; // 1234 % 1000 = 234
            int firstDigit = tempForLoop;
            for (int i = 1; i < count; i++) {
                firstDigit /= 10; // 1234 / 10 -> 123 / 10 -> 12 / 10 -> 1
            }
            result = remaining * 10 + firstDigit; // 234 * 10 + 1
            tempForLoop = result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print("Enter how many rotation you want number ");
        int no = sc.nextInt();
        System.out.println("Anti-Clockwise rotation of " + num + " is " + rotate(num, no));
        sc.close();
    }
}

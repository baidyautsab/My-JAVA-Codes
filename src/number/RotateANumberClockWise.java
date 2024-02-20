package number;

import java.util.Scanner;

public class RotateANumberClockWise {
    public static int rotate(int num, int no){ // 1234
        int temp = num / 10;
        int cloneNum = num;
        int count = 0;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        int result = 0;
        for(int j =  1; j <= no; j++) {
            int temp1 = cloneNum % 10; // to gate the last value || 1234 % 10 -> 4
            int temp2 = cloneNum / 10; // to gate the remaining value || 1234 / 10 -> 123
            int multiply = 10;
            if (count > 1) { // to gate what to multiply with the last value
                for (int i = 2; i <= count; i++) {
                    multiply *= 10;
                }
            }
            temp1 *= multiply; // 4 * 1000 -> 4000
            result = temp1 + temp2; // 4000 + 123 -> 1234
            cloneNum = result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print("Enter number of rotation you want ");
        int no = sc.nextInt();
        System.out.println("Clockwise rotation of " + num + " is " + rotate(num, no));
        sc.close();
    }
}

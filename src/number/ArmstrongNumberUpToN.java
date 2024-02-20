package number;

import java.util.Scanner;

public class ArmstrongNumberUpToN {
    public static void isArmstrong(int num1, int num2){
        for(int i = num1; i <= num2; i++) {
            int count = 0;
            int rim, sum = 0;
            int temp1 = i, temp2 = i;
            while (temp1 > 0) { // calculate the number of digit present in the number
                temp1 = temp1 / 10;
                count++;
            }
            while (temp2 > 0) { // logic for armstrong number
                rim = temp2 % 10;
                sum = sum + pow(rim, count);
                temp2 = temp2 / 10;
            }
            if (sum == i) // check both same or not
                System.out.print(i + " ");
        }
    }
    public static int pow(int b, int p){
        int multiply = 1;
        for(int i = 1; i <= p; i++){
            multiply = multiply * b;
        }
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting point ");
        int num1 = sc.nextInt();
        System.out.print("Enter ending point ");
        int num2 = sc.nextInt();
        isArmstrong(num1, num2);
        sc.close();
    }
}

package number;

import java.util.Scanner;

public class ArmstrongNumber { // for 3 digits number (static program)
    public static boolean isArmstrong(int num){
        int temp = num;
        int r, sum = 0; // r -> reminder
        while(num > 0){
            r = num % 10; // 134%10 = 4 || 13%10=3 || 1%10 = 1
            sum = sum + (r * r * r);
            num = num / 10; // 134/10 = 13 || 13/10 = 1 || 1/10 = 0
        }
        if(sum == temp)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " is Armstrong Number : " + isArmstrong(num));

        sc.close();
    }
}

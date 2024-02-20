package technicalRoundQuestions;

import java.util.Scanner;

public class Q23ArmstrongNumber { // for three digit armstrong number
    public static String isArmstrong(int num){
        int temp = num;
        int sum = 0;
        for(int i = 1; i <= 3; i++){
            int rim = temp % 10;
            sum = sum + pow(rim,3);
            temp = temp / 10;
        }
        if(sum == num)
            return "Yes";
        return "No";
    }
    public static int pow(int base, int power){
        int result = 1;
        for(int i = 1; i <= power; i++){
            result = result * base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number ");
        int num = sc.nextInt();
        System.out.println(num + " is Armstrong number " + isArmstrong(num));
        sc.close();
    }
}

package groomingClass;

import java.util.Scanner;

public class StrongNumber {
    public static boolean isStrong(int num){ // 145, 40585
        int temp = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + fact(rem);
            num = num / 10;
        }
        if(sum == temp)
            return true;
        return false;
    }
    public static int fact(int num){
        int res = 1;
        for(int i = num; i > 0; i--){
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(isStrong(num));
    }
}

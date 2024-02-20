package groomingClass;

import java.util.Scanner;

public class SpyNumber {
    public static boolean isSpy(int num){
        int pro = 1;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            pro = pro * rem;
            sum = sum + rem;
            num = num / 10;
        }
        if(sum == pro)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(isSpy(num));
    }
}

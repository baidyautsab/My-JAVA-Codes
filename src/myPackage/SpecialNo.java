package myPackage;

import java.util.Scanner;

public class SpecialNo {
    public static boolean isSpecial(int num){
        // the number(abc) will be special if a! + b! + c! = abc
       int temp1 = num, temp2 = num, count = 0, sum = 0;
       while(temp1 > 0){
           temp1 = temp1 / 10;
           count++;
       }
       while(temp2 > 0){
           int rim = temp2 % 10;
           sum = sum + fact(rim);
           temp2 /= 10;
       }
       if(num == sum)
           return true;
       return false;
    }
    public static int fact(int n){
        int fact = 1;
        for(int i = n; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num ");
        int num = sc.nextInt();
        System.out.println(num+" isSpecial: "+isSpecial(num));

        sc.close();
    }
}

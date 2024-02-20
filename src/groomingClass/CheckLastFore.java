package groomingClass;

import java.util.Scanner;

public class CheckLastFore {
    public static boolean check(int num){
        int temp = num;
        int count = 0;
        while (temp > 0){
            temp = temp / 10;
            count++;
        }
        if(count < 4)
            return false;
        else{
            int rem = num % 10000;
            int sum = 0;
            while(rem > 0){
                int rem2 = rem % 10;
                sum = sum + rem2;
                rem = rem / 10;
            }
            if(isPrime(sum))
                return true;
            return false;
        }
    }
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        if(num == 2)
            return true;
        if(num % 2 == 0)
            return false;
        else{
            for(int i = 3; i < num / 2; i++){
                if(num % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(check(num));
    }
}

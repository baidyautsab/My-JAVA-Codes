package number;

import java.util.Scanner;

public class CircularPrime {
    public static boolean rotate(int num){
        // 1193 || 3000 + 119 = 3119
        int numCopy = num;
        int count = 0;
        while(numCopy > 0){
            numCopy /= 10;
            count++;
        }
        for(int i = 1; i <= count; i++){
            int rem = num % 10; // 1193 % 10 = 3
            int remaining = num / 10; // 1193 / 10 = 119
            num = rem * pow(10, count - 1) + remaining; // 3000 + 119
            if(!isPrime(num))
                return false;
        }
        return true;
    }
    public static int pow(int base, int power){
        int res = 1;
        for(int i = 1; i <= power; i++){
            res = res * base;
        }
        return res;
    }
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        if(num == 2)
            return true;
        if(num % 2 == 0)
            return false;
        else{
            for(int i = 3; i < num; i++){
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
        System.out.println(num + " is circular prime " + rotate(num));
        sc.close();
    }
}

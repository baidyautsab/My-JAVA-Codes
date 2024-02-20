package number;

import java.util.Scanner;

public class NearestPrime {
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        else if(num == 2 || num == 3)
            return true;
        else if(num % 2 == 0)
            return false;
        else {
            for(int i = 3; i <= Math.sqrt(num); i++) {
                if(num % i == 0)
                    return false;
                else
                    return true;
            }
        }
        return false;
    }
    public static void printPrime(int num){
        if(isPrime(num)) {
            System.out.println(num + " is itself a prime number.");
            return;
        }
        int lower = num - 1;
        int upper = num + 1;
        while (true){
            if(isPrime(lower)){
                System.out.println(lower + " is closest prime number of " + num);
                return;
            }
            if(isPrime(upper)){
                System.out.println(upper + " is closest prime number of " + num);
                return;
            }
            lower--;
            upper++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        printPrime(num);

        sc.close();
    }
}

package myPackage;

import java.util.Scanner;

public class Prime2ndApproach {
    public static void check(int num){
        int count = 0;
        // for(int i = 2; i <= num / 2; i++){
        for(int i = 2; i <= (num >> 1); i++){ // bitwise operator faster than arithmetic operator
            // this approach iterate the loop half-time than previous one
            if(num % i == 0)
                count++;
        }
        if(count > 0)
            System.out.println(num + " is not a prime number");
        else
            System.out.println(num + " is a prime number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        check(num); // ->> O(n/2)
        sc.close();
    }
}

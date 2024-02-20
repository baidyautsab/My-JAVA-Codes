package myPackage;

import java.util.Scanner;

public class PrimeSqrt {
    public static void check(int num){
        if(num == 1 || num == 0) // -> 1
            System.out.println(num + " is not prime number");
        else if(num == 2) // -> 1
            System.out.println(num + " is a prime number");
        else if(num % 2 == 0) // -> 1
            System.out.println(num + " is non prime number(even)");
        else{ // -> 1
            for(int i = 2; i <= Math.sqrt(num); i = i + 2){ // -> sqrt(n)
                // the loop will be iterated 2-sqrt(number) time, that is less than half-time
                if(num % i == 0)
                    System.out.println(num + " is non prime number(odd)");
                else
                    System.out.println(num + " is a prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        check(num); // ->> O(sqrt(n)) time complexity
        sc.close();
    }
}

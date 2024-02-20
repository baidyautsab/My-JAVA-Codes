package myPackage;

import java.util.Scanner;

public class PrimeNo {
    static void prime(int num){
        if(num == 0 || num == 1) // -> 1
            System.out.println(num + " is not a prime number.");
        else if(num == 2) // -> 1
            System.out.println(num + " is a prime number.");
        else{ // -> 1
            for(int i = 2; i <= num-1; i++) {  // -> O(n) + 1 + 1 + 1
                // the number will be prime if it is divisible by 1 and itself, so iteration will start form 2 and end in n-1
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    break; // to stop the repetition of the output
                } else {
                    System.out.println(num + " is a prime number.");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        prime(num); // ->> O(n) time complexity

        sc.close();
    }
}

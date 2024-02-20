package groomingClass;

import java.util.Scanner;

public class FibonacciGivenRange {
    public static void print(int lower, int upper){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for(int i = lower; n3 <= upper; i++){
            n3 = n1 + n2;
            if(n3 >= lower && n3 <=upper)
                System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range : ");
        int lowerRange = sc.nextInt();
        System.out.print("Enter the upper range : ");
        int upperRange = sc.nextInt();
        print(lowerRange, upperRange);
    }
}

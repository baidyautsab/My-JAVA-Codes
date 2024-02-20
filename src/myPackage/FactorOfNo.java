package myPackage;

import java.util.Scanner;

public class FactorOfNo {
    static void factors(int num){
        for(int i = 1; i <= num; i++){
            if(num % i == 0)
                System.out.print(i+" ");
        }
    }
    static int sumOfFactor(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0)
                sum = sum + i;
        }
        return sum;
    }
    static void factorsExcept(int num){
        for(int i = 2; i <= num - 1; i++){
            if(num % i == 0)
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print("Factors of "+num+" are -> ");
        factors(num);
        System.out.println("\nSum of "+num+" factors is "+sumOfFactor(num));
        factorsExcept(num);

        sc.close();
    }
}

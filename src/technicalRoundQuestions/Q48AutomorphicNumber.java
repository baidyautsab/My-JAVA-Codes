package technicalRoundQuestions;

import java.util.Scanner;

public class Q48AutomorphicNumber {
    public static boolean isAutomorphic(int num){
        int square = num * num;
        System.out.println(num + "^" + num + " = " + square);
        int count = 0;
        int tempNum = num;
        while(tempNum > 0){
            tempNum /= 10;
            count++;
        }
        int i = 0;
        int add = 0;
        while(count > 0){
            int rem = square % 10;
            add = rem * pow(10,i) + add;
            square /= 10;
            i++;
            count--;
        }
        if(num == add)
            return true;
        else
            return false;
    }
    public static int pow(int base, int power){
        int multiply = 1;
        for(int i = 1; i <= power; i++){
            multiply *= base;
        }
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " is automorphic : " + isAutomorphic(num));
        sc.close();
    }
}

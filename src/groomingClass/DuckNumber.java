package groomingClass;

import java.util.Scanner;

public class DuckNumber {
    public static boolean isDuck(int num){
        while(num > 0){
            int rem = num % 10;
            if(rem == 0)
                return true;
            num = num / 10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " is duck number : " + isDuck(num));
    }
}

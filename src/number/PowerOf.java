package number;

import java.util.Scanner;

public class PowerOf {
    public static long power(long a, long b){
        long multiply = 1;
        for(int i = 1; i <= b; i++){
            multiply = multiply * a;
        }
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        long a = sc.nextLong();
        System.out.print("Enter 2nd number ");
        long b = sc.nextLong();

        System.out.println(a + "^" + b + " is " + power(a,b));
        sc.close();
    }
}

package myPackage;

import java.util.Scanner;

public class PowerOf {
    static int power(int num, int pow){
        int res = 1;
        for(int i = 1; i <= pow; i++){
            res = num * num;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print("Enter the power ");
        int pow = sc.nextInt();
        System.out.println(num+"^"+pow+" is "+power(num,pow));

        sc.close();
    }
}

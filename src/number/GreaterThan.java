package number;

import java.util.Scanner;

public class GreaterThan {
    public static int greater(int a, int b, int c){
        int greater = 1;
        if(a > b && a > c)
            greater = a;
        else if(b > a && b > c)
            greater = b;
        else
            greater = c;
        return greater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number ");
        int c = sc.nextInt();

        System.out.println("Greatest among three number is "+ greater(a, b, c));
        sc.close();
    }
}

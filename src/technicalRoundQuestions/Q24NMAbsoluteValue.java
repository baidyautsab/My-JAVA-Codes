package technicalRoundQuestions;

import java.util.Scanner;

public class Q24NMAbsoluteValue {
    public static int check(int n, int m){
        int lower = n - 1;
        int upper = n + 1;
        while (true){
            if(lower % m == 0)
                return lower;
            else if(upper % m == 0)
                return upper;
            lower--;
            upper++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N(find nearest value of N) ");
        int n = sc.nextInt();
        System.out.print("Enter M(divisible by M) ");
        int m = sc.nextInt();
        System.out.println(check(n,m));
        sc.close();
    }
}

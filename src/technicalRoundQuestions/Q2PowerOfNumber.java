package technicalRoundQuestions;

import java.util.Scanner;

public class Q2PowerOfNumber {
    public static int pow(int num, int pow){
        int result = 1;
        for(int i = 1; i <= pow; i++){
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print("Enter power ");
        int pow = sc.nextInt();
        System.out.println(num + "^" + pow + " : " + pow(num, pow));
        sc.close();
    }
}

package technicalRoundQuestions;

import java.util.Scanner;

public class Q35FibonacciOrNot {
    public static boolean isFibonacci(int num){
        int n1 = 0;
        int n2 = 1;
        while (true){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(n3 == num)
                return true;
            if(n3 > num)
                break;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num + " isFibonacci number : " + isFibonacci(num));
        sc.close();
    }
}

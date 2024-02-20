package technicalRoundQuestions;

import java.util.Scanner;

public class Q15EvenOddInRange {
    public static void check(int num){
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0)
                if(i < num)
                    System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        check(num);
        sc.close();
    }
}

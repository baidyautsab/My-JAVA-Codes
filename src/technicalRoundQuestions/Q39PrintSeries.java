package technicalRoundQuestions;

import java.util.Scanner;

public class Q39PrintSeries {
    // 1 2 5 8 14 24 34
    public static void print(int range){
        for(int i = 1; i <= range; i++){
            if(i % 2 == 0)
                System.out.print(i + " ");
            else
                System.out.print((2 * i - 1) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int range = sc.nextInt();
        print(range);
        sc.close();
    }
}

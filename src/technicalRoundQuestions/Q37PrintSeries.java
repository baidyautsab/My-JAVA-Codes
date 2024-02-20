package technicalRoundQuestions;

import java.util.Scanner;

public class Q37PrintSeries {
    public static void print(int range){
        for(int i = 1; i <= range; i++){
            System.out.print(i * i + " ");
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

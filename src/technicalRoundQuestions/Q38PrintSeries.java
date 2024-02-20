package technicalRoundQuestions;

import java.util.Scanner;

public class Q38PrintSeries {
    // 1 3  10 15 21
    public static void print(int range){
        int s = 0;
        for(int i = 1; i <= range; i++){
            s = s + i;
            System.out.print(s + " ");
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

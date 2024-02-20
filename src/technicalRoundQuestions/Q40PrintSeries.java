package technicalRoundQuestions;

import java.util.Scanner;

public class Q40PrintSeries {
    public static void print(int range){
        // 1 2 4 8 16 32
        for(int i = 0; i < range; i++){
            int result = (int)Math.pow(2,i);
            System.out.print(result + " ");
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

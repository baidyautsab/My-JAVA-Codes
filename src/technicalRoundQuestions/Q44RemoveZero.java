package technicalRoundQuestions;

import java.util.Scanner;

public class Q44RemoveZero {
    public static String removeZero(int num){
        String s = "";
        while(num > 0){
            int rim = num % 10;
            if(rim != 0)
                s = rim + s;
            num /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(removeZero(num));
        sc.close();
    }
}

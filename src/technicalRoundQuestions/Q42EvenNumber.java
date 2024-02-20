package technicalRoundQuestions;

import java.util.Scanner;

public class Q42EvenNumber {
    public static void print(int range){
        for(int i = 1; i <= range; i++){
            if(i % 2 == 0)
                System.out.print(i + " ");
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

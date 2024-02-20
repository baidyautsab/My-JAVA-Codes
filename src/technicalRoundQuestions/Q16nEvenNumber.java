package technicalRoundQuestions;

import java.util.Scanner;

public class Q16nEvenNumber {
    public static void print(int num){
        // num = 10 || 2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 , 20
        int count = 1;
        for(int i = 1; count <= num; i++){ // loop will be terminated for count time and i generate the numbers
            if(i % 2 == 0){
                System.out.print(i + " ");
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int num = sc.nextInt();
        print(num);
        sc.close();
    }
}

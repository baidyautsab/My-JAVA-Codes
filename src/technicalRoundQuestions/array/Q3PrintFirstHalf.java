package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q3PrintFirstHalf {
    public static void printHalf(int[] num){
        System.out.println("Printing the first half of the array ");
        for(int i = 0; i <= num.length / 2; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the elements ");
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }
        printHalf(num);
        sc.close();
    }
}

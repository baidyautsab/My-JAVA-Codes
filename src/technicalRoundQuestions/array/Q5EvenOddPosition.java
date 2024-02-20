package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q5EvenOddPosition {
    public static void print(int[] num){
        System.out.println("Printing Odd index elements ");
        for(int i = 0; i < num.length; i++){
            if(i % 2 != 0)
                System.out.print(num[i] + " ");
        }
        System.out.println("\nPrinting Even index elements ");
        for(int i = 0; i < num.length; i++){
            if(i % 2 == 0)
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
        print(num);
        sc.close();
    }
}

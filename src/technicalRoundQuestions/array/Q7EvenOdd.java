package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q7EvenOdd {
    public static void even(int[] num){
        System.out.println("Even elements of the array are ");
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0)
                System.out.print(num[i] + " ");
        }
    }
    public static void odd(int[] num){
        System.out.println("\nOdd elements of the array are ");
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 != 0)
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
        even(num);
        odd(num);
        sc.close();
    }
}

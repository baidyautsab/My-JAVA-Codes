package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q23BubbleSort {
    public static void bubble(int[] num){
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length - 1; j++){
                if(num[j] > num[j + 1]){
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("Printing the sorted array");
        for(int i = 0; i < num.length; i++){
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
        bubble(num);
        sc.close();
    }
}

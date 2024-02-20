package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q1CopyArray {
    public static void copy(int[] num){
        int[] copyNum = new int[num.length];
        for(int i = 0; i < num.length; i++){
            copyNum[i] = num[i];
        }
        System.out.println("New copy array is ");
        for(int i = 0; i < copyNum.length; i++){
            System.out.print(copyNum[i] + " ");
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
        copy(num);
        sc.close();
    }
}

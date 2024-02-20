package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q18ShiftZerosRight {
    public static void print(int[] num){
        int[] copy = new int[num.length];
        int j = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] != 0){
                copy[j] = num[i];
                j++;
            }
        }
        for(int i = 0; i < num.length; i++){
            if(num[i] == 0){
                copy[j] = num[i];
                j++;
            }
        }
        for(int i = 0; i < num.length; i++){
            System.out.print(copy[i] + " ");
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

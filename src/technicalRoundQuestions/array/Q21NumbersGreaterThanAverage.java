package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q21NumbersGreaterThanAverage {
    public static void print(int[] num){
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        avg = sum / num.length;
        System.out.println("Average of total elements is " + avg);
        System.out.println("Elements greater than the average are ");
        for(int i = 0; i < num.length; i++){
            if(num[i] > avg)
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

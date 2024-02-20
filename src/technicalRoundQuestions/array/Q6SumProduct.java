package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q6SumProduct {
    public static int sum(int[] num){
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        return sum;
    }
    public static int product(int[] num){
        int product = 1;
        for(int i = 0; i < num.length; i++){
            product = product * num[i];
        }
        return product;
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
        System.out.println("Sum of the array elements is " + sum(num));
        System.out.println("Product of the array elements is " + product(num));
        sc.close();
    }
}

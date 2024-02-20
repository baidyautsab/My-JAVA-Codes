package myPackage;

import java.util.Scanner;

public class MaxInArray {
    public static int largest(int size){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[size];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > max)
                max = num[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = sc.nextInt();
        System.out.println("Largest number present in the array is " + largest(size));
        sc.close();
    }
}

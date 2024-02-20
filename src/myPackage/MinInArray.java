package myPackage;

import java.util.Scanner;

public class MinInArray {
    public static int smallest(int size){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[size];
        System.out.println("Enter array elements ");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        int min = num[0];
        for(int i = 1; i < num.length; i++){
            if(min > num[i])
                min = num[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = sc.nextInt();
        System.out.println("Smallest number present in the array is " + smallest(size));
        sc.close();
    }
}

package array;

import java.util.Scanner;

public class ReverseArray {
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void printReverseArray(int[] a){
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array-------");
        printArray(arr);
        System.out.println("\nReverse array-------");
        printReverseArray(arr);
        sc.close();
    }
}

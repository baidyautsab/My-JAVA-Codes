package array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size ");
        int row = sc.nextInt();
        System.out.print("Enter the column size ");
        int column = sc.nextInt();
        int[][] num = new int[row][column];
        System.out.println("Enter the elements");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array is ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

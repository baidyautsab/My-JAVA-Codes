package dsa_problems;

import java.util.Scanner;

public class SumOfColumn {
    public static int sum(int[][] arr){
        int result = arr[0][0];
        int columnNo = 0;
        for(int i = 0; i < arr.length; i++){
            int tempSum = 0;
            for(int j = 0; j < arr[i].length; j++){
                tempSum = tempSum + arr[j][i];
                if(tempSum > result){
                    result = tempSum;
                    columnNo = i;
                }
            }
        }
        return columnNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row ");
        int row = sc.nextInt();
        System.out.print("Enter the column ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Highest sum present in column " + sum(arr));
    }
}

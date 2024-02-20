package pattern;

import java.util.Scanner;

public class InverseHalfPyramidNum {
    public static void print(int row){
        for(int i = row; i >= 1; i--){
            int num = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number ");
        int row = sc.nextInt();
        print(row);
        sc.close();
    }
}

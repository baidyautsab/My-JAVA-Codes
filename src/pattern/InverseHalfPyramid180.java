package pattern;

import java.util.Scanner;

public class InverseHalfPyramid180 {
    public static void print(int row){
        for(int i = row; i >= 1; i--){
            // inner loop -> space
            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }
            // inner loop -> star
            for(int j = 0; j <= row - i; j++){
                System.out.print("* ");
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

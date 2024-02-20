package pattern;

import java.util.Scanner;

public class NumberPyramid {
    public static void print(int row){
        for(int i = 1; i <= row; i++){
            // space
            for(int j = 1; j <= row - i; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
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

package pattern;

import java.util.Scanner;

public class HollowRectangleDiagonal {
    public static void print(int row){
        // print the hollow rectangle
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(i == 1 || i == row || j == 1 || j == row)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if(i == j && i != 1 && j != row)
                    System.out.print("*");
                else
                    System.out.print(" ");
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

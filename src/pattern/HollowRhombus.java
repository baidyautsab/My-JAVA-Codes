package pattern;

import java.util.Scanner;

public class HollowRhombus {
    public static void print(int row){
        for(int i = 1; i <= row; i++){
            // trailing space
            for(int j = 1; j <= row - i; j++){
                System.out.print("  ");
            }
            // print star
            for(int j = 1; j <= row; j++){
                if(i == 1 || i == row || j == 1 || j == row)
                    System.out.print("* ");
                else
                    System.out.print("  ");
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

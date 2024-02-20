package pattern;

import java.util.Scanner;

public class ReverseDiagonal {
    public static void print(int row){
        for(int i = row; i >= 1; i--){
            for(int j = 1; j <= row; j++){
                if(i == j)
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

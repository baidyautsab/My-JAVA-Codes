package pattern;

import java.util.Scanner;

public class Pattern6 {
    static void print(int row, int col){
        for(int i = 1; i <= row; i++){
            char c = 'A';
            for(int j = 1; j <= col; j++) {
                if (i % 2 != 0) {
                    System.out.print(c + " ");
                    c++;
                }else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row value ");
        int row = sc.nextInt();
        System.out.print("Enter column value ");
        int col = sc.nextInt();
        print(row,col);
        sc.close();
    }
}

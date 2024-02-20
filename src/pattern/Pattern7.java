package pattern;

import java.util.Scanner;

public class Pattern7 {
    static void print(int row, int col){
        char c = 'A';
        int num = 1;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if (i % 2 != 0) {
                    System.out.print(c + " ");
                    c++;
                }else{
                    System.out.print(num + " ");
                    num++;
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

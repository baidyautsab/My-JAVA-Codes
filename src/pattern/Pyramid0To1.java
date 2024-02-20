package pattern;

import java.util.Scanner;

public class Pyramid0To1 {
    public static void print(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
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

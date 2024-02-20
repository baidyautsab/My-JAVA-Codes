package pattern;

import java.util.Scanner;

public class ButterFly {
    public static void print(int row){
        // Upper half
        for(int i = 1; i <= row; i++){
            // star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // space
//            for(int j = 1; j <= row - i; j++){
//                System.out.print("  ");
//            }
            int space = 2 * (row - i);
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //------------------------------------
            // space
//            for(int j = 1; j <= row - i; j++){
//                System.out.print("  ");
//            }
            // star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for(int i = row; i >= 1; i--){
            // star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // space
//            for(int j = 1; j <= row - i; j++){
//                System.out.print("  ");
//            }
            int space = 2 * (row - i);
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //------------------------------------
            // space
//            for(int j = 1; j <= row - i; j++){
//                System.out.print("  ");
//            }
            // star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
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

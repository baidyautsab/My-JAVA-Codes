package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q15RotateLeftNTime {
    public static void print(int[] num, int k){
       // [1, 2, 3, 4, 5] -> [5, 1, 2, 3, 4]
        for(int i = 1; i <= k; i++){
            rotateLeft(num);
        }
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static int[] rotateLeft(int[] num){
        int zero = num[0];
        for(int j = 0; j < num.length - 1; j++){
            num[j] = num[j + 1];
        }
        num[num.length - 1] = zero;
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the elements ");
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Enter rotation time ");
        int k = sc.nextInt();
        print(num, k);
        sc.close();
    }
}

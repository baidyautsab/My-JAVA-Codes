package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q16RotateRightNTime {
    public static void print(int[] num, int k){
        for(int i = 1; i <= k; i++){
            rotateRight(num);
        }
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static int[] rotateRight(int[] num){
        int zero = num[num.length - 1];
        for(int i = num.length - 1; i >= 0; i--){
            if(i - 1 >= 0){
                num[i] = num[i - 1];
            }
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

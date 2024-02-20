package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q12MargeArray {
    public static void marge(int[] n1, int[] n2){
        int[] copyTwo = new int[n1.length + n2.length];
        int j = 0;
        for(int i = 0; i < n1.length; i++){
            copyTwo[j] = n1[i];
            j++;
        }
        for(int i = 0; i < n2.length; i++){
            copyTwo[j] = n2[i];
            j++;
        }
        System.out.println("The marge array is ");
        for(int i = 0; i < copyTwo.length; i++){
            System.out.print(copyTwo[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array ");
        int size1 = sc.nextInt();
        int[] num1 = new int[size1];
        System.out.println("Enter the elements of 1st array ");
        for(int i = 0; i < size1; i++){
            num1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of 2nd array ");
        int size2 = sc.nextInt();
        int[] num2 = new int[size2];
        System.out.println("Enter the elements of 2nd array ");
        for(int i = 0; i < size2; i++){
            num2[i] = sc.nextInt();
        }
        marge(num1, num2);
        sc.close();
    }
}

package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q8TrueSum {
    public static boolean checkSum(int[] num){
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0)
                sumEven = sumEven + num[i];
            else
                sumOdd = sumOdd + num[i];
        }
        if(sumEven == sumOdd)
            return true;
        return false;
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
        System.out.println(checkSum(num));
        sc.close();
    }
}

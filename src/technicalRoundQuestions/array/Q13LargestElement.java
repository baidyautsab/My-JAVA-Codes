package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q13LargestElement {
    public static int largest(int[] num){
        int largest = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > largest)
                largest = num[i];
        }
        return largest;
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
        System.out.println("Largest element present in the array is " + largest(num));
        sc.close();
    }
}

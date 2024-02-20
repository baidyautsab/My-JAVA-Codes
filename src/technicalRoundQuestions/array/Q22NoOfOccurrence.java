package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q22NoOfOccurrence {
    public static int occurrence(int[] num, int key){
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] == key)
                count++;
        }
        return count;
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
        System.out.print("Enter the value to found ");
        int key = sc.nextInt();
        System.out.println(key + " occurrence " + occurrence(num, key) + " time in the array");
        sc.close();
    }
}

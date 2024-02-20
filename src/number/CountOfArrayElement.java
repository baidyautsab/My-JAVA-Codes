package number;

import java.util.Scanner;

public class CountOfArrayElement {
    public static void calculate(int num){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        int count_p = 0, count_n = 0, count_z = 0;
        for(int i = 0; i < num; i++){
            if(arr[i] == 0)
                count_z++;
            if(arr[i] < 0)
                count_n++;
            if(arr[i] > 0)
                count_p++;
        }
        System.out.println("Count of positive number is " + count_p);
        System.out.println("Count of negative number is " + count_n);
        System.out.println("Count of zero is " + count_z);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total array element number you want ");
        int num = sc.nextInt();
        calculate(num);
        sc.close();
    }
}

package technicalRoundQuestions;

import java.util.Scanner;

public class Q46MergeNumberLeft {
    public static int margeNumber(int num1, int num2){
        // n1 = 12 || n2 = 34 || num = 3412
        int tempNum1 = num1;
        int count = 0;
        while(tempNum1 > 0){
            tempNum1 /= 10;
            count++;
        }
        num2 = num2 * pow(10, count);
        return num1 + num2;
    }
    public static int pow(int base, int power){
        int result = 1;
        for(int i = 1; i <= power; i++){
            result = result * base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + margeNumber(num1,num2));
        sc.close();
    }
}

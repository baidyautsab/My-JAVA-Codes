package technicalRoundQuestions;

import java.util.Scanner;

public class Q50UniqueNumber {
    public static void isUnique(int num){
        // num = 1234
        int numCopy = num;
        int countDigit = 0;
        while(num > 0){
            int rem = num % 10;
            int temp = num / 10;
            while(temp > 0){
                int nextRem = temp % 10;
                if(rem == nextRem){
                    countDigit++;
                    break;
                }
                temp = temp / 10;
            }
            num = num / 10;
        }
        if(countDigit >= 1)
            System.out.println(numCopy + " is not unique number.");
        else
            System.out.println(numCopy + " is unique number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        isUnique(num);
        sc.close();
    }
}

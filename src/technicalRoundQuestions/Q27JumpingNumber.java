package technicalRoundQuestions;

import java.util.Scanner;

public class Q27JumpingNumber {
    public static int returnJumpingNo(int num){
        int result = 0;
        for(int i = num; i >= 0; i--){
            if(isJumping(i)) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static boolean isJumping(int num){
        int count = 0;
        int temp = num;
        int digit1, digit2;
        while(num > 0){ // we lost the num here
            num /= 10;
            count++;
        }
        for(int i = 1; i < count; i++){ // to get digit1 and digit2
            digit1 = temp % 10;
            temp = temp / 10;
            digit2 = temp % 10;
            if(!checkDigit(digit1, digit2))
                return false;
        }
        return true;
    }
    public static boolean checkDigit(int n1, int n2){
        if(n1 + 1 == n2 || n1 - 1 == n2)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Nearest jumping number of " + num + " is " + returnJumpingNo(num));
        sc.close();
    }
}

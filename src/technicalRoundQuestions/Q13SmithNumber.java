package technicalRoundQuestions;

import java.util.Scanner;

public class Q13SmithNumber {
    public static boolean isSmith(int num){
        int sumOfPrimeFactor = 0;
        // factors
        for(int i = 2; i <= num; i++){ // for gating factors
            if(num % i == 0) { // excluding 1
                for(int j = 2; j <= i / 2; j++){
                    if(i % j != 0) {
                        sumOfPrimeFactor += Q11SumAndProductOfDigits.digitSum(i);
                    }
                }
            }
        }
        if(Q11SumAndProductOfDigits.digitSum(num) == sumOfPrimeFactor)
            return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.println(isSmith(num));
    }
}

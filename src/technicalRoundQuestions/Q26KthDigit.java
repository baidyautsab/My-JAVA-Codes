package technicalRoundQuestions;

import java.util.Scanner;

public class Q26KthDigit {
    public static int returnDigit(int base, int power, int kth){
        int count = 0;
        int result = 0;
        int finalResult = 0;
        // 3^3 = 27
        result = pow(base, power);
        int tempResult = result;
        // to check the total digit after powered
        while(tempResult > 0){
            tempResult /= 10;
            count++;
        }
        // return the kth value
        if(kth <= count) {
//            int mod = pow(10,kth);
//            finalResult = result % mod;
            for(int j = 1; j <= kth; j++){
                finalResult = result % 10;
                result /= 10;
            }
        }else{
            return 0;
        }
        return finalResult;
    }
    public static int pow(int base, int power){
        int powerOf = 1;
        for(int i = 1; i <= power; i++){
            powerOf *= base;
        }
        return powerOf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int base = sc.nextInt();
        System.out.print("Enter the power ");
        int power = sc.nextInt();
        System.out.print("Enter kth value ");
        int kth = sc.nextInt();
        System.out.println(base + "^" + power + " = " + pow(base, power));
        System.out.println(kth + "th value is " + returnDigit(base, power, kth));
        sc.close();
    }
}

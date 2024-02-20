package technicalRoundQuestions;

import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int num) {
        int temp = num;
        int div = checkCount(temp);
        int sqr = num * num;
        if (sqr % Math.pow(10, div) == num)
            return true;
        return false;
    }

    public static int checkCount(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {25, 76, 6};
        boolean flag = false;
        for (int i = 0; i < num.length; i++) {
            if (!isAutomorphic(num[i])) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Is Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}

package number;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ArmstrongNumberDynamic {
    public static void isArmstrong(int num){
        int count = 0, temp1 = num, temp2 = num;
        int rim, sum = 0;
        while(temp1 > 0){ // calculate the number of digit present in the number
            temp1 = temp1 / 10;
            count++;
        }
        while(temp2 > 0){ // logic for armstrong number
            rim = temp2 % 10;
            sum = sum + pow(rim, count);
            temp2 = temp2 / 10;
        }
        if(sum == num) // check both same or not
            System.out.print(num + " is a armstrong number");
        else
            System.out.print(num + " is not a armstrong number");
    }
    public static int pow(int b, int p){
        int multiply = 1;
        for(int i = 1; i <= p; i++){
            multiply = multiply * b;
        }
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        isArmstrong(num);
        sc.close();
    }
}

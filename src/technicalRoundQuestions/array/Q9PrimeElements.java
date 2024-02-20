package technicalRoundQuestions.array;

import java.util.Scanner;

public class Q9PrimeElements {
    public static void print(int[] num){
        System.out.println("Prime elements are ");
        for(int i = 0; i < num.length; i++){
            if(isPrime(num[i]))
                System.out.print(num[i] + " ");
        }
    }
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        if(num == 2)
            return true;
        if(num % 2 == 0)
            return false;
        else{
            for(int i = 3; i <= num / 2; i++){
                if(num % i == 0)
                    return false;
            }
            return true;
        }
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
        print(num);
        sc.close();
    }
}

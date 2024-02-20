package array;

import java.math.BigInteger;
import java.util.Scanner;

public class DecimalToBinary {
    public static BigInteger convert(int n){
        BigInteger res = new BigInteger("0");
        int i = 0;
        while(n > 0){
            BigInteger rem = BigInteger.valueOf(n % 2);
            res = rem.multiply(pow(10, i)).add(res);
            i++;
            n = n / 10;
        }
        return res;
    }
    public static BigInteger pow(int base, int power){
        BigInteger result = new BigInteger("0");
        for(int i = 1; i <= power; i++){
            result = result.multiply(BigInteger.valueOf(base));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size ");
//        int size = sc.nextInt();
//        System.out.println("Enter the elements ");
//        int[] arr = new int[size];
//        for(int i = 0; i <= size - 1; i++){
//            arr[i] = sc.nextInt();
//        }
        System.out.println(convert(25));
        sc.close();
    }
}

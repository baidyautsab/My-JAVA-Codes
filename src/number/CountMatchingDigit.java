package number;

import java.util.Scanner;

public class CountMatchingDigit {
    public static int count(int num, int key){
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if (i % 10 == key && i / 10 == key)
                count = count + 2;
            else if (i % 10 == key || i / 10 == key)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range ");
        int num = sc.nextInt();
        System.out.print("Enter the key, has to be match ");
        int key = sc.nextInt();
        System.out.print(key + " present in the range is " + count(num,key ));
        sc.close();
    }
}

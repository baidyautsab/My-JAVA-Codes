package GFG;

import java.util.Arrays;

public class FascinatingNumber {
    static boolean fascinating(long n) {
        // code here
        long two = n * 2;
        long three = n * 3;
        String s = n + "" + two + "" + three;
        long res = Long.parseLong(s);
        long temp = res;
        int count = 0;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        long[] arr = new long[count];
        for(int i = 0; i < count; i++){
            long rem = res % 10;
            arr[i] = rem;
            res = res / 10;
        }
        Arrays.sort(arr);
        long check = 1;
        boolean flag = true;
        for(int i = 0; i < count; i++){
            if(arr[i] == check){
                check++;
                continue;
            } else {
                flag = false;
                break;
            }
        }
        if(flag == true)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(fascinating(192));
    }
}

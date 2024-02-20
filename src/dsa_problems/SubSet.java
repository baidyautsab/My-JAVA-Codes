package dsa_problems;

import java.util.Arrays;

public class SubSet {
    public static String isSubset( long a1[], long a2[], long n, long m) {
        int count = 0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i = 0; i < a2.length; i++){
            boolean found = false;
            for(int j = i; j < a1.length; j++){
                if(a2[i] == a1[j]){
                    found = true;
                    break;
                }
            }
            if(found)
                count++;
        }
        if(count == a2.length)
            return "Yes";
        return "No";
    }

    public static void main(String[] args) {
        long a1[] = {10, 5, 2, 23, 19};
        long a2[] = {19, 5, 2};
        System.out.println(isSubset(a1, a2, a1.length, a2.length));
    }
}

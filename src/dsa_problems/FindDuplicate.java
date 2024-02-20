package dsa_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicate {
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 0; i < v1.length; i++){
            int compair = v1[i];
            for(int j = 0; j < v2.length; j++){
                if(compair == v2[j]){
                    l.add(compair);
                    break;
                }
            }
        }
        Collections.sort(l);
        return l;
    }
    public static ArrayList<Integer> best_solution(int v1[], int v2[]){
        List<Integer> listV1 = new ArrayList<>();
        List<Integer> listV2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(v1);
        Arrays.sort(v2);

        int i = 0, j = 0;

        while (i < v1.length && j < v2.length) {
            if (v1[i] == v2[j]) {
                result.add(v1[i]);
                i++;
                j++;
            } else if (v1[i] < v2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int v1[] = {1, 2, 3, 4, 2, 3};
        int[] v2 = {2, 2, 4, 3, 1};
        System.out.println(common_element(v1, v2));
    }
}

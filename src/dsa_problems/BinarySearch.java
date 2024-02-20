package dsa_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] arr, int key){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key)
                return mid;
            else if (arr[mid] < key) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 33, 5, 0, 19, 8};
        int key = 5;

        System.out.println("key " + key  + " is present at index: " + search(arr, key));
    }
}

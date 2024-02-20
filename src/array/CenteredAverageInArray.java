package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CenteredAverageInArray {
    public static int centeredAverage(int[] nums) {
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (smallest > nums[i])
                smallest = nums[i];
        }
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest)
                largest = nums[i];
        }
        int sum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != smallest && nums[i] != largest) {
                sum = sum + nums[i];
                count++;
            }
        }
        int countS = 0, countL = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == smallest)
                countS++;
            else if (nums[i] == largest)
                countL++;
        }
        if (countS > 1) {
            for (int i = 2; i <= countS; i++) {
                sum = sum + smallest;
                count++;
            }
        }
        if (countL > 1) {
            for (int i = 2; i <= countL; i++) {
                sum = sum + largest;
                count++;
            }
        }
        return sum / count;
    }
    // 2nd approach
    public static int centeredAverage2(int[] nums){
        Arrays.sort(nums);
        int sum = 0; int count = 0;
        for(int i = 1; i < nums.length - 1; i++){
            sum = sum + nums[i];
            count++;
        }
        return sum / count;
    }
    public static void main(String[] args) {
        int[] nums = {100, 0, 5, 3, 4};
        System.out.println(centeredAverage2(nums));
    }
}

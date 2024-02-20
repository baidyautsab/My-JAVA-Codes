package array;

public class LargestElement {
    public static int largest(int[] nums){
        int largest = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest)
                largest = nums[i];
        }
        int smallest = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(smallest > nums[i])
                smallest = nums[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = {11, 23, 4, 67, 10, 9};
        System.out.println(largest(arr));
    }
}

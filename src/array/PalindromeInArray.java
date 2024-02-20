package array;

public class PalindromeInArray {
    public static boolean isPalindrome(int num){
        // 121
        int copyNum = num;
        int res = 0;
        while(copyNum > 0){
            int rem = copyNum % 10;
            res = res * 10 + rem;
            copyNum = copyNum / 10;
        }
        if(num == res)
            return true;
        return false;
    }
    public static void checkArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(isPalindrome(arr[i]))
                System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 23, 111, 232, 45, 2849, 22322, 99, 190,78};
        System.out.println("Original array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nPalindrome number present in array are : ");
        checkArray(arr);
    }
}

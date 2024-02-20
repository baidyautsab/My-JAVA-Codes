package array;

public class RotateDigitsOfArrayElement {
    public static int rotateNum(int num){
        // 1234 > 123 | 4 => 4000 + 123 = 4123
        int copyNum = num;
        int count = 0;
        while(copyNum > 0){
            copyNum /= 10;
            count++;
        }
        int last = num % 10;
        int first = num / 10;
        return last * pow(count - 1) + first;
    }
    public static int pow(int power){
        int res = 1;
        for(int i = 1; i <= power; i++){
            res = res * 10;
        }
        return res;
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(rotateNum(arr[i]) + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 23, 1234, 232, 45, 2849, 223, 99, 190,78};
        System.out.println("Original array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray elements after one right rotation : ");
        printArray(arr);
    }
}

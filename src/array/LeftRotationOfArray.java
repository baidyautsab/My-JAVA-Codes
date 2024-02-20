package array;

public class LeftRotationOfArray {
    public static void rotate(int[] arr){
        System.out.println("Before rotation ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter rotation ");
        int zeroth = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
            System.out.print(arr[i] + " ");
        }
        arr[arr.length - 1] = zeroth;
        System.out.print(arr[arr.length - 1]);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
    }
}

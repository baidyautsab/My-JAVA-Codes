package array;

public class RightRotationOfArray {
    public static void rotate(int[] arr){
        System.out.println("Before rotation ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter rotation ");
        for(int i = 0; i < arr.length; i++){
            if(i == 0)
                System.out.print(arr[arr.length - 1] + " ");
            else
                System.out.print(arr[i - 1] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
    }
}

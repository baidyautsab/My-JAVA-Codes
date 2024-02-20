package array;

public class StoreReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 23, 56, 9, 10};
        int[] arrCopy = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            arrCopy[j] = arr[i];
            j++;
        }
        ReverseArray.printArray(arrCopy);
    }
}

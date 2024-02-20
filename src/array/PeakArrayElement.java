package array;

public class PeakArrayElement {
    public static int peakElement(int[] arr){
        if(arr.length < 1){
            return 0;
        }
        else if(arr.length == 1){
            return arr[0];
        }
        else if(arr.length == 2){
            if(arr[0] >= arr[1])
                return arr[0];
            else
                return arr[1];
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < arr[i+1] && arr[i+1] > arr[i+2])
                    return arr[i+1];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 11, 2, 23};
        System.out.println(peakElement(arr));
    }
}

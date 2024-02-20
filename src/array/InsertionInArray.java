package array;

public class InsertionInArray {
    public static void insert(int[] arr, int nth, int addElement){
        System.out.println("Before insertion ");
        for(int i = 0; i < nth; i++){ // don't want to print all 20 value, because there are default value
            System.out.print(arr[i] + " ");
        }
        if(nth > arr.length)
            return;
        else{
            arr[nth] = addElement;
        }
        System.out.println("\nAfter insertion ");
        for(int i = 0; i <= nth; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 5;
        arr[1] = 1;
        arr[2] = 23;
        arr[3] = 10;
        arr[4] = 6;
        int nth = 5; // total array element, also represent the insertion position
        int addElement = 33;
        insert(arr,nth,addElement);
    }
}

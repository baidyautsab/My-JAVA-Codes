package array;

public class SeparateEven {
    public static void separate(int[] arr){
        System.out.println("Before separation ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter separation ");
        int j = 0; // index for new array
        int[] newArray = new int[arr.length];
        //even part
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                newArray[j] = arr[i];
                j++;
            }
        }
        //odd part
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                newArray[j] = arr[i];
                j++;
            }
        }
        // printing new array
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        separate(arr);
    }
}

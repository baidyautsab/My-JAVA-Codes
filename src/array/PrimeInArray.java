package array;

public class PrimeInArray {
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        else if(num == 2)
            return true;
        else if(num % 2 == 0)
            return false;
        else{
            for(int i = 3; i <= num/2; i++){
                if(num % i == 0)
                    return false;
            }
        }
        return true;
    }
    public static void checkElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i]))
                System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 33, 13, 17, 28, 29, 35, 41};
        System.out.println("Original array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nPrime elements are : ");
        checkElement(arr);
    }
}

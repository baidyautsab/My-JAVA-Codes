package array;

public class ArmstrongNumberInArray {
    public static boolean isArmstrong(int num){
        // 153 = 1^3 + 5^3 + 3^3
        int copyNum = num;
        int count = 0;
        int temp = num;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        int sum = 0;
        while(copyNum > 0){
            int rem = copyNum % 10;
            sum = sum + pow(rem,count);
            copyNum = copyNum / 10;
        }
        if(num == sum)
            return true;
        else
            return false;
    }
    public static int pow(int base, int power){
        int res = 1;
        for(int i = 1; i <= power; i++){
            res = res * base;
        }
        return res;
    }
    public static void checkArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(isArmstrong(arr[i]))
                System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1634, 0, 11, 34, 100, 153, 370, 371 };
        System.out.println("Original array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArmstrong numbers present inside the array are : ");
        checkArray(arr);
    }
}

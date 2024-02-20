package presentation;

public class PrimeNumber1to100 {
    public static void print(){
        for(int i = 0; i <= 100; i++){
            if (prime(i))
                System.out.print(i + " ");
        }
    }
    public static boolean prime(int num){
        if(num <= 1)
            return false;
        if(num == 2 || num == 3)
            return true;
        if(num % 2 == 0 || num % 3 == 0)
            return false;
        else{
            for(int j = 5; j <= Math.sqrt(num); j++){
                //for(int j = 5; j <= num; j++){
                if(num % j == 0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        print();
    }
}

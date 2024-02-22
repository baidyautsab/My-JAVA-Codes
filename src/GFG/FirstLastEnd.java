package GFG;

public class FirstLastEnd {
        static int numbersInRange(int L, int R){
            // code here
            int count = 0;
            for(int i = L; i <= R; i++){
                if(isSame(i))
                    count++;
            }
            return count;
        }
        static boolean isSame(int num){
            int temp = num;
            int count = 0;
            while(temp > 0){
                temp /= 10;
                count++;
            }
            System.out.println(num % 10 + " " + num / (int) Math.pow(10, count - 1));
            if(num % 10 == num % (int) Math.pow(10, count))
                return true;
            return false;
        }
        public static void main(String[] args) {
            System.out.println(numbersInRange(7, 64));
        }
}

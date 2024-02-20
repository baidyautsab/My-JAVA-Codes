package technicalRoundQuestions;

public class SwapNumber {
    public static void swap(int a, int b){
        if(a < 0){
            a = Math.abs(a);
            b = Math.abs(b);
            a = a + b;
            b =  a - b;
            a = a - b;
            b = (-1) * b;
        } else if(b < 0){
            a = Math.abs(a);
            b = Math.abs(b);
            a = a + b;
            b =  a - b;
            a = a - b;
            a = (-1) * a;
        } else {
            a = a + b;
            b =  a - b;
            a = a - b;
        }
        System.out.println("After swapping a: " + a + " b: " + b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        System.out.println("Before swapping a: " + a + " b: " + b);
        swap(a, b);
    }
}

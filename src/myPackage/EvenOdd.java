package myPackage;

import java.util.Scanner;

public class EvenOdd {
    // printing n even number
    void nEven(int num) {
        //case 1
        // for(int i=0; i<=num*2; i++){
    //        if (i % 2 ==) {
    //            System.out.print(i + " ");
    //        }
    //    }
        //case 2
//        int startingPoint = 2;
//        for(int i=0; i<=num; i++){
//            System.out.print(startingPoint+" ");
//            startingPoint+=2;
//            }
        // case 3
        for(int i=1; i<=num; i++){
            System.out.print(i*2+" ");
        }
        //case 4
        for(int i=2; i<=num*2; i=i+2){
            System.out.print(i+" ");
        }
    }

    //printing nth even number
    int  nthEven(int num){
        return num*2;
    }
    // printing even number upto num
    void even(int num){
        for(int i=1; i<=num; i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        EvenOdd e1 = new EvenOdd();
        e1.nEven(num);
        //System.out.println(e1.nthEven(num));
        sc.close();
    }
}

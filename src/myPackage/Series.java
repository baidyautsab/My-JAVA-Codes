package myPackage;

import java.util.Scanner;

public class Series {
    // 1 3 6 10 15 21 28 -----
    void series1(int num){
        int startingPoint = 1;
        int diff = 2;
        for(int i = 0; i<=num; i++){
            System.out.print(startingPoint+" ");
            startingPoint = startingPoint + diff;
            diff++;
        }
    }

    // 1 4 7 10 13 ----
    void series2(int num){
        int startingPoint = 1;
        int diff = 3;
        for(int i=1; i<=num; i++){
            System.out.print(startingPoint+" ");
            startingPoint = startingPoint + diff;
        }
    }

    // 2 15 41 80 -------
    void series3(int num){
        int startingPoint = 2;
        int diff = 13;
        int inc = 2;
        for(int i=0; i<=num; i++){
            System.out.print(startingPoint+" "); // 2      15      41      80      132--------
            startingPoint = startingPoint + diff; //  2+13   15+26  41+39  80+52------
            diff = 13*inc; // 26  39  52 65-------
            inc++; // 3 4 5 6-------
        }
    }

    // 6, 9, 14, 21, 30, 42, -------
    void series4(int num){
        int startingPoint = 6;
        int diff = 3;
        for(int i=0; i<=num; i++){
            System.out.print(startingPoint+" ");
            startingPoint = startingPoint + diff;
            diff = diff + 2;
        }
    }

    // 0, 2, 6, 12, 20, 30, 42, -----
    void series5(int num){
        // 1st approach
//        int diff = 0, start = 0;
//        for(int i = 1; i <= num; i++) {
//            System.out.print(start + " ");
//            diff += 2;
//            start = start + diff;
//        }
        // 2nd approach
        int digit = 0;
        for(int i = 0; i <= num; i++){
            digit = i * i + i;
            System.out.print(digit+" ");
        }
    }

    // 10, 5, 60, 15, 110, ........
    void series6(int num){
        int a = 10, b = 5;
        for(int i = 0; i <= num; i++){
            if(i % 2 == 0){
                System.out.print(a + " ");
                a += 50;
            }else{
                System.out.print(b + " ");
                b += 10;
            }
        }
    }

    // 6, 11, 21, 36, 56,......
    void series7(int num){
        int diff = 5, sum = 6;
        for(int i = 1; i <= num; i++){
            System.out.print(sum+ " ");
            sum = sum + diff;
            diff += 5;
        }
    }

    // 1 9 17 33 49 73 97 ...N
    void series8(int num){
        int n;
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0) {
                n = (int) (2 * Math.pow(i, 2) + 1);
                System.out.print(n + " ");
            }else{
                n = (int) (2 * Math.pow(i, 2) - 1);
                System.out.print(n + " ");
            }
        }
    }

    // 1/1+1/2+1/3..+1/N
    void series9(int num){
        double sum = 0;
        System.out.print("Sum of the series : ");
        for(double i = 1f; i <= num; i++){
            System.out.print(1 + "/" + i + " ");
            sum += (1/i);
        }
        System.out.print(" is " + sum);
    }

    // 1,22,333,4444...n
    void series10(int num){
        int i;
        for(i = 1; i <= num; i++){ // this loop give the i value which will be print
            for(int j = 1; j <= i; j++){ // this loop decide how many times the i will be printed
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
    void table(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();

        Series s1 = new Series();
        //s1.series1(num);
        //s1.series2(num);
        //s1.series3(num);
        //s1.series4(num);
        //s1.series5(num);
        //s1.series6(num);
        //s1.series7(num);
        //s1.series8(num);
        //s1.series9(num);
        s1.series10(num);

        //s1.table(num);
        sc.close();
    }
}

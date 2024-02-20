package myPackage;

import java.util.Scanner;

public class NameArray {
    public static void arrayDetails(int size){
        System.out.println("Enter name of your friends ");
        Scanner sc = new Scanner(System.in);
        String[] name = new String[size];
        // for get the inputs
        for(int i = 0; i < name.length; i++){
            name[i] = sc.nextLine();
        }
        // for print the output
        for(int i = 0; i < name.length; i++){
            System.out.print(name[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size = sc.nextInt();
        arrayDetails(size);
        sc.close();
    }
}

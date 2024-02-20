package dsa_problems;

import java.util.Scanner;

public class StackMenuDriven {
    static int[] stack;
    static int top;
     public static void createStack(int size){
         stack = new int[size];
         top = -1;
         System.out.println("Stack is created with size " + size);
     }
     public static void push(int ele){
         if(top == stack.length - 1)
             System.out.println("Stack Overflow");
         else{
             top++;
             stack[top] = ele;
             System.out.println(ele + " had been added");
         }
     }
     public static void display(){
         System.out.println("=======Stack Elements=======");
         if(top == -1)
             System.out.println("Stack is empty");
         else {
             for(int i = top; i >= 0; i--){
                 System.out.println(stack[i]);
             }
         }
     }
     public static void pop(){
         if(top == -1)
             System.out.println("Stack underflow");
         else{
             System.out.println(stack[top] + " had been deleted");
             top--;
         }
     }
     public static boolean isEmpty(){
         return top == -1;
     }
     public static boolean isFull(){
         return top == stack.length - 1;
     }
     public static void clear(){
         System.out.println("Stack is cleared");
         top = -1;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Stack Manu Driven Program==========");
        while (true){
            System.out.println("======Manu======");
            System.out.println("1. Create Stack \n2.Push \n3.Pop \n4.Check Empty \n5.Check Full \n6.Clear \n7.Display \n8.Exit");
            System.out.print("Chose an option ");
            int op = sc.nextInt();
            System.out.println("--------------------------------");
            switch (op){
                case 1:
                    System.out.print("Enter the size of stack ");
                    int size = sc.nextInt();
                    createStack(size);
                    break;
                case 2:
                    System.out.print("Push the element ");
                    int ele = sc.nextInt();
                    push(ele);
                    break;
                case 3:
                    pop();
                    break;
                case 4:
                    System.out.println("Stack is empty: " + isEmpty());
                    break;
                case 5:
                    System.out.println("Stack is full: " + isFull());
                    break;
                case 6:
                    clear();
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    System.out.println("Successfully exited");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

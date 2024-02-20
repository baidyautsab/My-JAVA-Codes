package dsa_problems;

import java.util.Scanner;

public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
class LinkedListImpl{
    Node head;
    void insert(int ele){
        Node n = new Node(ele);
        if(head == null)
            head = n;
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println(ele + " had been inserted");
    }
    void display(){
        if(head == null){
            System.out.println("Linked-List is empty");
        } else{
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    void delete(){
        if(head == null){
            System.out.println("Linked-List is empty");
        } else if (head.next == null) {
            System.out.println(head.data + " got deleted");
            head = null;
        } else{
            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;
            System.out.println(temp.next.data + " got deleted");
            temp.next = null;
        }
    }
    void deleteFront(){
        if(head == null)
            System.out.println("Linked-List is empty");
        else {
            System.out.println(head.data + " got deleted");
            head = head.next;
        }
    }
    void insertFront(int ele){
        Node n = new Node(ele);
        if(head == null)
            head = n;
        else {
            n.next = head;
            head = n;
        }
        System.out.println(ele + " had been inserted");
    }
}
class CreateLL{
    public static void main(String[] args) {
        LinkedListImpl l1 = new LinkedListImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======Manu======");
            System.out.println("1. Insert element \n2. Display Link-List \n3. Delete element \n4. Delete from front \n5. Insert to front \n6.Exit");
            System.out.print("Chose an option ");
            int op = sc.nextInt();
            System.out.println("--------------------------------");
            switch (op) {
                case 1:
                    System.out.print("Give the value to insert ");
                    int val = sc.nextInt();
                    l1.insert(val);
                    break;
                case 2:
                    System.out.print("Displaying the Link-List: ");
                    l1.display();
                    break;
                case 3:
                    l1.delete();
                    break;
                case 4:
                    System.out.print("Value deleting from front ");
                    l1.deleteFront();
                    break;
                case 5:
                    System.out.print("Give the value to insert into front ");
                    int val2 = sc.nextInt();
                    l1.insertFront(val2);
                    break;
                case 6:
                    System.out.println("Successfully exited");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

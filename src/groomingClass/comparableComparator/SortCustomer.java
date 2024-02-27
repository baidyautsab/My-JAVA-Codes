package groomingClass.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortCustomer {
    public static void main(String[] args) {
        ArrayList<Customer> al = new ArrayList<>();
        al.add(new Customer(1, "Utsab", 24, 8343838660L, "West Bengal"));
        al.add(new Customer(4, "Biren", 22, 548685462L, "UP"));
        al.add(new Customer(3, "Rishab", 23, 9845845455L, "Bihar"));
        al.add(new Customer(2, "Ankita", 24, 548451154L, "Bihar"));

        System.out.println("based on id");
        Collections.sort(al);
        for(Customer c : al){
            System.out.println(c);
        }
        System.out.println("based on name");
        Collections.sort(al, new CustomerBasedOnName());
        for (Customer c : al){
            System.out.println(c);
        }
        System.out.println("based on state");
        Collections.sort(al, new CustomerBasedOnState());
        for(Customer c : al){
            System.out.println(c);
        }
        System.out.println("based on age");
        Collections.sort(al, new CustomerBasedOnAge());
        for(Customer c : al){
            System.out.println(c);
        }
    }
}

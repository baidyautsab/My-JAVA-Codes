package groomingClass.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeSal {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(1, "Utsab", 22000, 24));
        al.add(new Employee(2, "Prasun", 25000, 23));
        al.add(new Employee(3, "Rishab", 27000, 22));
        al.add(new Employee(4, "Biren", 12000, 22));

//        to call the compareTo() ->
        Collections.sort(al); // internally calls the compareTo() method
        for(Employee ele : al){
            System.out.println(ele);
        }
        System.out.println("------------------------------------------------------------");
        Collections.sort(al, new EmployeeBasedOnAge());
        for(Employee ele : al){
            System.out.println(ele);
        }
        System.out.println("------------------------------------------------------------");
        Collections.sort(al, new EmployeeBasedOnName());
        for(Employee ele : al){
            System.out.println(ele);
        }
    }
}

package groomingClass.comparableComparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double sal;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String name, double sal, int age) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(this.sal > o.sal)
            return 1;
        else if(this.sal < o.sal)
            return -1;
        return 0;
    }
}
class EmployeeBasedOnAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getAge() > o2.getAge())
            return 1;
        else if(o1.getAge() < o2.getAge())
            return -1;
        return 0;
    }
}
class EmployeeBasedOnName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
package groomingClass.MultiThreading;

public class Mainclass {
    public static void main(String[] args) {
        Thread th = new Thread(); // creating thread object
        System.out.println(th.getId()); // auto generated
        System.out.println(th.getName()); // user define or JVM define default value
        System.out.println(th.getPriority()); // can 1-10, default is 5

        th.setName("MyThread");
        th.setPriority(6);

        System.out.println(th.getName());
        System.out.println(th.getPriority());
    }
}

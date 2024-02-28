package groomingClass.MultiThreading;

public class RunSequence {
    public static void main(String[] args) {
        System.out.println("main method started");

        NumberSequenceThread nst1 = new NumberSequenceThread();
//        nst1.setPriority(2);
        nst1.start();
        //nst1.start(); // gives exception IllegalThreadStateException , can't start a thread for two time

        NumberSequenceThread nst2 = new NumberSequenceThread();
        //nst2.start();

        NumberSequenceThread2 nst3 = new NumberSequenceThread2();
//        nst3.setPriority(6);
        nst3.start();

        System.out.println("main method ended");
    }
}

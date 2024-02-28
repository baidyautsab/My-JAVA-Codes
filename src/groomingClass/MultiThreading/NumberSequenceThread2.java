package groomingClass.MultiThreading;

public class NumberSequenceThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Printing 10 to 1");
        for (int i = 10; i > 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

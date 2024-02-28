package groomingClass.MultiThreading;

public class NumberSequenceThread extends Thread{
    @Override
    public void run() {
        System.out.println("printing 1 to 10");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

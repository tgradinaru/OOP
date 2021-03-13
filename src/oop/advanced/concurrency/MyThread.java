package oop.advanced.concurrency;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println("In my thread at step " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

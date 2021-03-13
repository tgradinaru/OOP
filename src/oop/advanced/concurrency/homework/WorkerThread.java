package oop.advanced.concurrency.homework;

import java.time.LocalTime;

public class WorkerThread extends Thread {

    private Worker worker;

    public WorkerThread(Worker worker) {
        this.worker = worker;
    }
    public void stopWork(){
        worker.setIfLeaving();

    }

    @Override
    public void run() {
        worker.setIfArrived();
        while (worker.isIfArrived()) {
            //System.out.println(worker.getName() + " I'm still working " + LocalTime.now());
            try {
                System.out.println(worker.getName() + " I'm still working " + LocalTime.now());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

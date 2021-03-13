package oop.advanced.concurrency.homework;

import java.time.LocalTime;
import java.util.List;

public class MyThread extends Thread {
    private List<Worker> workerList;

    public MyThread(List<Worker> workerList) {
        this.workerList = workerList;
    }

    @Override
    public void run() {
        for (int i = 0; i < workerList.size(); i++) {
            try {
                Thread.sleep(5000);
                System.out.println(workerList.get(i).getName() + " I'm still working " + LocalTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(workerList.get(i).getName() + " I'm still working " + LocalTime.now());
        }
    }
}

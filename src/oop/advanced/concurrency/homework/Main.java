package oop.advanced.concurrency.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WorkerThread> workerList= new ArrayList<>();
        Worker worker1 = new Worker("John");
        Worker worker2 = new Worker("Duck");
        Worker worker3 = new Worker("Patrick");
        Worker worker4 = new Worker("Anna");
        Worker worker5 = new Worker("Athena");

        WorkerThread workerThread1 = new WorkerThread(worker1);
        workerList.add(workerThread1);
        WorkerThread workerThread2 = new WorkerThread(worker2);
        workerList.add(workerThread2);
        WorkerThread workerThread3 = new WorkerThread(worker3);
        workerList.add(workerThread3);
        WorkerThread workerThread4 = new WorkerThread(worker4);
        workerList.add(workerThread4);
        WorkerThread workerThread5 = new WorkerThread(worker5);
        workerList.add(workerThread5);


        for (WorkerThread element : workerList) {
            element.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (workerList.size()>0){
            workerList.get(0).stopWork();
            workerList.remove(0);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

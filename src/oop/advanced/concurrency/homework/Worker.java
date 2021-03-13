package oop.advanced.concurrency.homework;

import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicBoolean;

public class Worker {
    private String name;
    private volatile boolean ifArrived;

    public Worker(String name) {
        this.name = name;
    }

    public void setIfArrived(){
        this.ifArrived = true;
        System.out.println(this.name + ": I came to work at " + LocalTime.now());
    }

    public void setIfLeaving(){
        this.ifArrived = false;
        System.out.println(this.name + ": I left from work at " + LocalTime.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIfArrived() {
        return ifArrived;
    }
}

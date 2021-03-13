package oop.advanced.concurrency;

public class Bench {
    Integer availableSeats;

    public Bench(Integer availableSeats) {
        this.availableSeats = availableSeats;

    }

    public synchronized void takeASeat(Integer threadIndex) { //synchronized
        if (availableSeats > 0) {
            System.out.println("Taking a seat from thread " + threadIndex);
            availableSeats--;
            System.out.println("Free seats left " + availableSeats + " in thread " + threadIndex);
        } else {
            System.out.println("There are no available seats in thread " + threadIndex);
        }
    }

    public void printSynchronizedBlock(Integer threadIndex) {
        synchronized (this) {
            System.out.println("In synced block in thread " + threadIndex);
        }
        System.out.println("Not synchronized code in thread " + threadIndex);
    }
}

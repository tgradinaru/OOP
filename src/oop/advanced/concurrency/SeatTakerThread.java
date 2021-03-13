package oop.advanced.concurrency;

public class SeatTakerThread extends Thread {
    private int threadIndex;
    private Bench bench;


    public SeatTakerThread(Bench bench, int threadIndex) {
        this.bench = bench;
        this.threadIndex = threadIndex;
    }

    @Override
    public void run() {
        bench.takeASeat(threadIndex);
        bench.printSynchronizedBlock(threadIndex);
    }
}

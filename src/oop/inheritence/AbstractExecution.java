package oop.inheritence;

public class AbstractExecution {
    public void calculus(){
    }

    public void executionTime() {
        long startTime = System.currentTimeMillis();
        calculus();
        long endTime = System.currentTimeMillis();
        System.out.println("\n Execution time " + (endTime - startTime) + " millis");
        ;
    }
}

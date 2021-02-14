package oop.inheritence;

public class AbstractChild extends AbstractExecution {
    @Override
    public void calculus() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        ;

    }
}

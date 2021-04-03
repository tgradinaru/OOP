package oop.patterns.singleton2;

public class Main {

    public static void main(String[] args) {
        Lift lift1 = Lift.getInstance();
        Lift lift2 = Lift.getInstance();
        Lift lift3 = Lift.getInstance();
        Lift lift4 = Lift.getInstance();
        Lift lift5 = Lift.getInstance();
    }
}

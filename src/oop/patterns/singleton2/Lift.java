package oop.patterns.singleton2;

import oop.patterns.singleton.Sun;

public class Lift {
    private static Lift instance;

    private Lift() {
        System.out.println("S-a apelat constructorul clasei lift");
    }

    public static Lift getInstance() {
        if (instance == null) {
            System.out.println("Instance e null");
            synchronized (Lift.class) {
                if (instance == null) {
                    instance = new Lift();
                }
            }
        } else
            System.out.println("Instance is not null");
        return instance;
    }
}

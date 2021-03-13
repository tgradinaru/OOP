package oop.patterns.singleton;

public class Sun {
    private static Sun instance;

    private Sun() {
        System.out.println("s-a apelat constructorul SUN");
    }

    public static Sun getInstance() {

        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }
        return instance;
    }
}

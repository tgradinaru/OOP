package oop.advanced.enums;

public enum Planets {

    MERCUR("Small", 100000),
    VENUS("Medium", 3000000),
    JUPITER("Huge", 10000000);

    private String size;
    private int distance;

    Planets(String size, int distance) {
        this.size = size;
        this.distance = distance;
    }

    String getSize() {
        return size;
    }

    public void distanceFromEarth(){
        System.out.println(name() + " " + distance);
    }

    String getName() {
        return name();
    }


    @Override
    public String toString() {
        return size + " " + name();
    }
}

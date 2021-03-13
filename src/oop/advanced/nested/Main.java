package oop.advanced.nested;

public class Main {
    public static void main(String[] args) {
        Bycicle bycicle = new Bycicle();

        System.out.println(bycicle.getMaxSpeed());
        Bycicle.Wheel wheel = bycicle.new Wheel();
        wheel.repair();
        System.out.println(bycicle.getMaxSpeed());

        Bycicle.Mechanic mechanic = new Bycicle.Mechanic();
        mechanic.damage(bycicle);
        System.out.println(bycicle.getMaxSpeed());

    }
}

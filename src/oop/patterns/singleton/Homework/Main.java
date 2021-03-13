package oop.patterns.singleton.Homework;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = Animal.getInstance();
        Animal animal2 = Animal.getInstance();

        Animal.getInstance();
        Animal.getInstance();

        animal1.setType("Lion");
        System.out.println(animal1.getType());
        animal2.setType("Cat");
        System.out.println(animal2.getType());

        System.out.println(animal1 == animal2);
    }
}

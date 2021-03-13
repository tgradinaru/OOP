package oop.advanced.collections.lists.Homework;

public class Person implements Comparable<Person>{
    private int centimeters;
    public Person(int centimeters){
        this.centimeters = centimeters;
    }
    @Override
    public int compareTo(Person person2){
        return person2.centimeters - this.centimeters;
    }

    @Override
    public String toString() {
        return "Person{" +
                "centimeters=" + centimeters +
                '}';
    }
}

package oop.advanced.collections.lists.Homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(170);
        Person person2 = new Person(189);

        if (person1.compareTo(person2) > 0) {
            System.out.println(" person1 > person2");
        } else if (person2.compareTo(person2) == 0) {
            System.out.println("1=2");
        } else {
            System.out.println("person2 > person1");
        }

        List<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(person1);
        System.out.println(personList);

        Collections.sort(personList);
        System.out.println(personList);
    }
}

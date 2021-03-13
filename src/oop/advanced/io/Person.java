package oop.advanced.io;

import java.io.Serializable;

public class Person implements Serializable {

    private transient String firstName; //transient ascunde aceasta informatie si nu se va serializa/deserializa
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

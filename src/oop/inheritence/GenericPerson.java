package oop.inheritence;

public class GenericPerson {
    String name;
    String surname;
    int age;

    public GenericPerson(String name, String surname) { //constructor
        this.name = name;
        this.surname = surname;
    }

    public GenericPerson() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "GenericPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

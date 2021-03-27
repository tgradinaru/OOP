package oop.advanced.lambdaAndInterfacesHomework;

import java.util.Arrays;

public class Employee implements Measurable {
    String name;
    double salary;



    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

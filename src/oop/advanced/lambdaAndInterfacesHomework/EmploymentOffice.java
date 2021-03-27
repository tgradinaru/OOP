package oop.advanced.lambdaAndInterfacesHomework;

import java.util.*;

public class EmploymentOffice {

    public static void main(String[] args) {
        Employee ang1 = new Employee("Gigi", 30.0);
        Employee ang2 = new Employee("Iona", 40.0);
        Employee ang3 = new Employee("Jean", 50.0);
        Employee ang4 = new Employee("Kurt", 60.0);
        Employee[] angajati = {ang1, ang2, ang3, ang4};

        System.out.println("Media salariilor: " + average(angajati));
        System.out.println("Salariul maxim: " + largestSalary(angajati));
    }

    public static OptionalDouble average(Measurable[] employees) {
        return Arrays.stream(employees)
                .mapToDouble(Measurable::getMeasure).average();
    }

    public static String largestSalary(Measurable[] employees) {
        return Arrays.stream(employees)
                .max(Comparator.comparingDouble(e -> e.getMeasure())).get().toString();
    }

}

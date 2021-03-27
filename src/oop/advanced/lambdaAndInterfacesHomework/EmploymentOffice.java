package oop.advanced.lambdaAndInterfacesHomework;

import java.util.*;

public class EmploymentOffice {

    public static void main(String[] args) {
        Employee ang1 = new Employee("Gigi", 32.0);
        Employee ang2 = new Employee("Iona", 47.0);
        Employee ang3 = new Employee("Jean", 53.0);
        Employee ang4 = new Employee("Kurt", 69.0);

        Employee[] angajati = {ang1, ang2, ang3, ang4};
        System.out.println("Media salariilor: " + average(angajati));
        System.out.println("Salariul maxim: " + largestSalary(angajati));



    }

    public static double average(Measurable[] employees) {
        return Arrays.stream(employees)
                .mapToDouble(e -> e.getMeasure()).sum() / employees.length;
    }

    public static String largestSalary(Measurable[] employees) {
        return Arrays.stream(employees)
                .max(Comparator.comparingDouble(e -> e.getMeasure())).get().toString();
    }

}

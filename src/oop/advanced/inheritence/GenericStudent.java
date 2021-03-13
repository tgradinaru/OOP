package oop.advanced.inheritence;

public class GenericStudent extends GenericPerson{
    String schoolName;
    int regNumber;

    public GenericStudent(String name, String surname, int age, String schoolName, int regNumber){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schoolName = schoolName;
        this.regNumber = regNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getRegistrationNumber() {
        return regNumber;
    }

    @Override
    public String getName (){
        return this.name;
    }

    public String toString() {
        return "GenericStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                ", registrationNumber=" + regNumber +
                '}';
    }
}

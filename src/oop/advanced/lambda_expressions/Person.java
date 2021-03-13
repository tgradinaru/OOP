package oop.advanced.lambda_expressions;

public class Person {
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isAdult(Person person){
        return person.getAge()>18;
    }
    public boolean isAdultnoParameters(){
        return age>18;
    }
}

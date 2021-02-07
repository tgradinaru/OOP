package oop.inheritence;

public class Dog extends Animal{        //extends -

    public void bark(){
        System.out.println("Ham ham");
    }

    @Override
    public void eat(){
        System.out.println("The dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Ham ham");
    }
}

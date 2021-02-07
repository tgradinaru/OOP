package oop.inheritence;

public class Cat extends Animal{

    public void purr(){         // toarce
        System.out.println("The cat is purring");
    }

    @Override                           //Polimorfism de Compile TIME  OVERRIDING in copil din clasa parinte
    public void makeSound() {
        System.out.println("Meow meow");
    }

    public void purr (String catname) {      //Polimorfism de RUN-TIME   OVERLOADING au parametri diferiti
        System.out.println("The cat " + catname + " is purring");
    }
}

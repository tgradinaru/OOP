import oop.abstraction.Cat;
import oop.inheritence.*;

public class Main {
    public static void main(String[] args) {
        //playWithAbstraction();
        //playWithInheritance();
        //playWithPolymorphism();
        //playWithGeometricFigures();
        //playWithExtendedBankAccount();
        playWithGenerickPackage();
    }

    private static void playWithGeometricFigures() {
        GeometricFigure circle = new Circle(3); // polimorfism de tip Run-time
        GeometricFigure square = new Square(5);  // polimorfism de tip Run-time
        GeometricFigure triangle = new Triangle(2, 3, 4);
        GeometricFigure rectangle = new Rectangle(2, 3);

        System.out.println("Perimetrul patrat: " + square.calculatePerimeter());
        System.out.println("Perimetrul cerc: " + circle.calculatePerimeter());
        System.out.println("Perimetrul triunghi : " + triangle.calculatePerimeter());
        System.out.println("Perimetrul dreptunghi: " + rectangle.calculatePerimeter());
        System.out.println("---------------------------");
        System.out.println("Aria patrat: " + square.calculateArea());
        System.out.println("Aria cerc: " + circle.calculateArea());
        System.out.println("Aria triunghi : " + triangle.calculateArea());
        System.out.println("Aria dreptunghi: " + rectangle.calculateArea());
    }

    private static void playWithPolymorphism() {
        Animal animal = new Animal();
        Animal dog = new Dog();     // aici avem polimorfismul
        Animal cat = new oop.inheritence.Cat();
        oop.inheritence.Cat otherCat = new oop.inheritence.Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        otherCat.purr();
        otherCat.purr("Angel");  // compile time polymorphism (static) Method OVERLOADING
    }

    public static void playWithInheritance() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        oop.inheritence.Cat cat = new oop.inheritence.Cat();

        animal.eat();
        dog.eat();      //  mostenita
        dog.bark();
        cat.purr();
        cat.eat();      // mostenita
        System.out.println("------------------");

        Animal[] arrayOfAnimals = new Animal[3];
        arrayOfAnimals[0] = animal;
        arrayOfAnimals[1] = dog;
        arrayOfAnimals[2] = cat;

        //este varianta de for clasic
        for (int i = 0; i < arrayOfAnimals.length; i++) {
            arrayOfAnimals[i].makeSound();
        }
        System.out.println("------------------");


        // este varianta  de for enhanced de iterare (parcurgere) a elementelor din array
        for (Animal element : arrayOfAnimals) {
            element.makeSound();            //runtime polymorphism OVER RIDING
        }

    }

    public static void playWithAbstraction() {
        Cat cat = new Cat();
        cat.sleep();
        System.out.println(cat);
        cat.play();
        System.out.println(cat);
        cat.feed();
        System.out.println(cat);
    }

    public static void playWithExtendedBankAccount() {
        ExtendedBankAccount account1 = new ExtendedBankAccount(100, 0.12f);
        System.out.println(account1.getBalance());
        account1.addMonthlyInterest();
        System.out.println(account1.getBalance());
    }

    public static void playWithGenerickPackage() {
        GenericPackage package1 = new GenericPackage("147956478584", 5.6, "Laptop");
        package1.setNewCourierName("Pierre-Carry");
        //System.out.println(package1.getCourierName());
        System.out.println(package1.computeDetails());
        System.out.println("The code is: " + package1.checkID());
    }
}

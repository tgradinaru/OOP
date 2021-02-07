import oop.abstraction.Cat;
import oop.inheritence.*;

public class Main {
    public static void main(String[] args) {
        //playWithAbstraction();
        //playWithInheritance();
        //playWithPolymorphism();
        playWithGeometricFigures();
    }

    private static void playWithGeometricFigures(){
        GeometricFigure circle = new Circle(3); // polimorfism de tip Run-time
        GeometricFigure square = new Square(5);  // polimorfism de tip Run-time
        GeometricFigure triangle = new Triangle(2,3,4);
        GeometricFigure rectangle = new Rectangle(2,3);

        System.out.println("Perimetrul patrat: " + square.calculatePerimeter());
        System.out.println("Perimetrul cerc: " + circle.calculatePerimeter());
        System.out.println("Perimetrul triunghi : " + triangle.calculatePerimeter());
        System.out.println("Perimetrul dreptunghi: " + rectangle.calculatePerimeter());

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
        arrayOfAnimals[1]= dog;
        arrayOfAnimals[2] = cat;


        //este varianta de for clasic
        for (int i = 0; i< arrayOfAnimals.length;i++){
            arrayOfAnimals[i].makeSound();
        }
        System.out.println("------------------");


        // este varianta  de for enhanced de iterare (parcurgere) a elementelor din arrayu
        for (Animal element:arrayOfAnimals){
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
}

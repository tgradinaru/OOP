package oop.advanced.inheritence;
public class Main {
    public static void main(String[] args) {

        //playWithAbstraction();
        //playWithInheritance();
        //playWithPolymorphism();
        //playWithGeometricFigures();
        //playWithExtendedBankAccount();
        //playWithGenericPackage();
        //playWithAbstractClass();
        ///////////////////////////
        //playWithGenericStudent();

    }

    private static void playWithGenericStudent() {
        GenericStudent[] arrayOfStudents = new GenericStudent[10];
        GenericStudent s01 = new GenericStudent("Ion", "vasi", 19, "CJ", 102);
        GenericStudent s02 = new GenericStudent("Vasi", "ion", 20, "CR", 103);
        GenericStudent s03 = new GenericStudent("John", "Smith", 23, "CA", 104);
        GenericStudent s04 = new GenericStudent("Sam", "Fox", 24, "TM", 110);
        GenericStudent s05 = new GenericStudent("Cat", "New", 39, "LD", 956);
        GenericStudent s06 = new GenericStudent("Ion", "joe", 45, "BU", 696);
        GenericStudent s07 = new GenericStudent("Ane", "Pop", 43, "BV", 845);
        GenericStudent s08 = new GenericStudent("Ion", "Cuc", 37, "IS", 444);
        GenericStudent s09 = new GenericStudent("Pop", "ion", 29, "GL", 468);
        GenericStudent s10 = new GenericStudent("John", "Doe", 33, "CT", 336);
        arrayOfStudents[0] = s01;
        arrayOfStudents[1] = s02;
        arrayOfStudents[2] = s03;
        arrayOfStudents[3] = s04;
        arrayOfStudents[4] = s05;
        arrayOfStudents[5] = s06;
        arrayOfStudents[6] = s07;
        arrayOfStudents[7] = s08;
        arrayOfStudents[8] = s09;
        arrayOfStudents[9] = s10;
        for (GenericStudent element : arrayOfStudents) {
            if (element.getName().equalsIgnoreCase("ion")) {
                System.out.println(element.toString());
            }
        }
    }

    private static void playWithAbstractClass() {
        AbstractChild abstractChild = new AbstractChild();
        abstractChild.executionTime();
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
        Animal cat = new oop.advanced.inheritence.Cat();
        oop.advanced.inheritence.Cat otherCat = new oop.advanced.inheritence.Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        otherCat.purr();
        otherCat.purr("Angel");  // compile time polymorphism (static) Method OVERLOADING
    }

    public static void playWithInheritance() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        oop.advanced.inheritence.Cat cat = new oop.advanced.inheritence.Cat();

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
        oop.advanced.abstraction.Cat cat = new oop.advanced.abstraction.Cat();
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

    public static void playWithGenericPackage() {
        GenericPackage package1 = new GenericPackage("213142341425", 5.6, "Laptop");
        package1.setNewCourierName("Pierre-Carry");
        //System.out.println(package1.getCourierName());
        System.out.println(package1.computeDetails());
        System.out.println("The code is: " + package1.checkID());
    }
}

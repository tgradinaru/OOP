package oop.advanced.genericTypes;

public class Main {
    public static void main(String[] args) {
        Car normalCar = new Car(240);

        GenericBox<Car> carBox = new GenericBox<>(normalCar);
        System.out.println("*** normalCar from carBox ***");
        System.out.println(carBox.getItem().getMaxSpeed());
        System.out.println("***");

        Car superCar = new Car(240);

        Garage<Car> garage = new Garage<>(superCar);
        garage.repair();
        System.out.println(garage.getVehicle().getMaxSpeed());

        Garage<Vehicle> vehicle = new Garage<>(superCar);

        vehicle.repair();
        System.out.println(vehicle.getVehicle().getMaxSpeed());
    }
}

package oop.advanced.enums;

public class Main {
    public static void main(String[] args) {
        LengthUnit lengthUnit = LengthUnit.CENTIMETER;
        System.out.println(lengthUnit + " has value " + lengthUnit.getValue());

        lengthUnit = LengthUnit.METER;

        switch (lengthUnit) {
            case CENTIMETER:
                System.out.println("We have centimeters");
                break;
            case METER:
                System.out.println(" We have meters");
                break;
            case INCH:
                System.out.println("We have inches");
                break;
            case FOOT:
                System.out.println("We have foot");
                break;
        }

        System.out.println(lengthUnit.name());
        System.out.println("*******************");
        for (LengthUnit unit : LengthUnit.values()) {
            System.out.println(unit);
        }
        System.out.println("********************");


        //Planets planets = Planets.JUPITER;
        for (Planets planets : Planets.values()) {
            //System.out.println(planets.getSize() + " " + planets.name());
            System.out.println(planets);
        }
        //System.out.println(Planets.JUPITER.distanceFromEarth());
        Planets.JUPITER.distanceFromEarth();
    }
}

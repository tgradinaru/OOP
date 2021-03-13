package oop.advanced.enums;

public enum LengthUnit {
    METER(1),
    CENTIMETER(100),
    FOOT(6),
    INCH(7);

    private double value;
    LengthUnit (double value){
        this.value = value;
    }
    double getValue(){
        return value;
    }
}

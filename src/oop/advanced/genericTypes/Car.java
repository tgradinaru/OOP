package oop.advanced.genericTypes;

public class Car extends Vehicle{
    private Integer maxSpeed;

    public Car(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void repair() {
        System.out.println("Car is repaired");
    }
}

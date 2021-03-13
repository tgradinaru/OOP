package oop.advanced.genericTypes;

public class Garage<T extends Vehicle> {  //vehicle si tot ce mosteneste vehicle lowerbound
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }
    public void repair(){
        vehicle.setMaxSpeed(vehicle.getMaxSpeed()+10);
    }

    public T getVehicle() {
        return vehicle;
    }
}

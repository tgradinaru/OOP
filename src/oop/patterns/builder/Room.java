package oop.patterns.builder;

public class Room {

    private RoomDimension roomDimension;
    private int noOfWindows;
    private int noOfDoors;


    public void setRoomDimension(RoomDimension roomDimension) {
        this.roomDimension = roomDimension;
    }

    public void setNoOfWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomDimension=" + roomDimension +
                ", noOfWindows=" + noOfWindows +
                ", noOfDoors=" + noOfDoors +
                '}';
    }
}

package oop.patterns.builder;

public class RoomBuilder {
    private RoomDimension roomDimension;
    private int noOfWindows;
    private int noOfDoors;

    public RoomBuilder withDimensions(RoomDimension roomDimension) {
        this.roomDimension = roomDimension;
        return this;
    }

    public RoomBuilder withDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
        return this;
    }

    public RoomBuilder withWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
        return this;
    }

    public Room build() {
        Room room = new Room();
        room.setNoOfDoors(noOfDoors);
        room.setNoOfWindows(noOfWindows);
        room.setRoomDimension(roomDimension);
        return room;
    }
}

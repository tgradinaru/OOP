package oop.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {

    private List<Room> rooms = new ArrayList<>();
    private RoofBuilder roofBuilder = new RoofBuilder();
    private boolean hasBasement;
    private boolean hasGarden;
    private boolean hasPorch; //veranda


    public HouseBuilder withRoomOf(int width, int length, int height) {
        Room room = new RoomBuilder()
                .withDimensions(new RoomDimension(width, length, height))
                .withDoors(2)
                .withWindows(2)
                .build();
        rooms.add(room);
        return this;
    }

    public HouseBuilder withRoofFrom(String material) {
        roofBuilder = roofBuilder.withRoofFrom(material);
        return this;
    }

    public HouseBuilder withLoft() {
        roofBuilder = roofBuilder.withStorageOnly(false);
        return this;
    }

    public HouseBuilder withRoofSides(int noOfSides) {
        roofBuilder = roofBuilder.withRoofSides(noOfSides);
        return this;
    }

    public HouseBuilder withGarden() {
        hasGarden = true;
        return this;
    }

    public House build() {
        House house = new House();
        house.setHasBasement(hasBasement);
        house.setHasGarden(hasGarden);
        house.setHasPorch(hasPorch);
        house.setRoof(roofBuilder.build());
        house.setRooms(rooms);
        return house;
    }
}

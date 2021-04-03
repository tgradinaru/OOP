package oop.patterns.builder;

public class Main {
    public static void main(String[] args) {
        //ce nu vreau sa fac:
        //House house = new House(many parameters here);

        //ce vreau sa fac
        House house = new HouseBuilder()
                .withRoomOf(4, 6, 4)
                .withRoomOf(5, 5, 4)
                .withRoomOf(3, 6, 4)
                .withRoofFrom("tile")
                .withLoft()
                .withRoofSides(6)
                .withGarden()
                .build();
        System.out.println(house);

        House house2 = new HouseBuilder()
                .withRoofFrom("tile")
                .withRoofSides(2)
                .withRoomOf(49, 678, 5)
                .build();
        System.out.println(house2);

        House house3= new HouseBuilder()
                .withRoofSides(4)
                .withRoofFrom("tile")

                .build();
        System.out.println(house3);
        System.out.println("\n\n\n\n");

        House emptyHouse = new HouseBuilder()
                .withLoft().build();
        System.out.println(emptyHouse);
    }
}

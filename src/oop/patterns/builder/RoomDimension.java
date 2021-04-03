package oop.patterns.builder;

public class RoomDimension {
    private int width;
    private int length;
    private int height;

    public RoomDimension(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "RoomDimension{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}

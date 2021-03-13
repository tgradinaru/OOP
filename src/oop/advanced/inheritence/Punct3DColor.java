package oop.advanced.inheritence;

public class Punct3DColor extends Punct3D {
    private String color;

    public Punct3DColor(int x, int y, int z, String color) { //constructor
        super(x, y, z);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public boolean comparaPuncte3DColor(Punct3DColor p) {
        return comparaPuncte(p) && this.color.equals(p.color);
    }
    @Override
    public boolean comparaPuncte(Punct3D p){
        if (this.x == p.x && this.y == p.y && this.z == p.z) {
            System.out.println("The Coloured points are in the same 3D position");
            return true;
        }
        return false;
    }
    public boolean comparePointsColor(Punct3DColor p){
        return this.color.equals(p.color);
    }

    @Override
    public String toString() {
        return "Punct3DColor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", color='" + color + '\'' +
                '}';
    }
}

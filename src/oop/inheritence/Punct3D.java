package oop.inheritence;

public class Punct3D {
    int x, y, z;

    public Punct3D(int x, int y, int z) {   //Constructor
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void mutaPunct3d(int dx, int dy, int dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }


    public boolean comparaPuncte(Punct3D p) {
        if (this.x == p.x && this.y == p.y && this.z == p.z) {
            System.out.println("The points are in the same 3D position");
            return true;
        }
        return false;
    }

    public double distance(Punct3D p){
        double distance;
        distance = Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y-p.y)*(this.y-p.y)+(this.z-p.z)*(this.z-p.z));
        return distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}



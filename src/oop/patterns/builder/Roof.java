package oop.patterns.builder;

public class Roof {
    private String material;
    private int numberOfSides;
    private boolean isStorageOnly;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void setStorageOnly(boolean storageOnly) {
        isStorageOnly = storageOnly;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "material='" + material + '\'' +
                ", numberOfSides=" + numberOfSides +
                ", isStorageOnly=" + isStorageOnly +
                '}';
    }
}

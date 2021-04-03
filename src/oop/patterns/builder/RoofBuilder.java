package oop.patterns.builder;

public class RoofBuilder {

    private String material;
    private int numberOfSides;
    private boolean isStorageOnly = true;

    public RoofBuilder withRoofFrom(String material) {
        this.material = material;
        return this;
    }

    public RoofBuilder withStorageOnly(boolean isStorageOnly) {
        this.isStorageOnly = isStorageOnly;
        return this;
    }

    public RoofBuilder withRoofSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        return this;
    }

    public Roof build() {
        Roof roof = new Roof();
        roof.setMaterial(material);
        roof.setNumberOfSides(numberOfSides);
        roof.setStorageOnly(isStorageOnly);
        return roof;
    }
}

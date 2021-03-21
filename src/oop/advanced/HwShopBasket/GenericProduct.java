package oop.advanced.HwShopBasket;

import java.time.LocalDate;

public class GenericProduct implements Product{
    private String supplier;
    private String productName;
    private double supplingPrice;
    private LocalDate availableDate;

    public double getSupplingPrice() {
        return supplingPrice;
    }

    public GenericProduct(String supplier, String productName, double supplingPrice, LocalDate availableDate) {
        this.supplier = supplier;
        this.productName = productName;
        this.supplingPrice = supplingPrice;
        this.availableDate = availableDate;
    }

    public GenericProduct(String supplier, String productName, double price) {
        this.supplier = supplier;
        this.productName = productName;
        this.supplingPrice = price;
    }

    @Override
    public String toString() {
        return " " +
                "<<" + productName + ">> " +
                //", availableDate=" + availableDate +
                ' ';
    }

    public String getProductName() {
        return this.productName;
    }

    @Override
    public double getPrice() {
        return this.supplingPrice;
    }

    @Override
    public boolean getAvailability() {
        return LocalDate.now().isAfter(availableDate);
    }
}

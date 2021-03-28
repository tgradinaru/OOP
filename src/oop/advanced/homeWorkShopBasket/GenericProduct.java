package oop.advanced.homeWorkShopBasket;

import java.time.LocalDate;

public class GenericProduct implements Product {
    private String supplier;
    private String productName;
    private double supplyingPrice;
    private LocalDate availableDate;

    public GenericProduct() {

    }

    public double getSupplyingPrice() {
        return supplyingPrice;
    }

    public GenericProduct(String supplier, String productName, double supplyingPrice, LocalDate availableDate) {
        this.supplier = supplier;
        this.productName = productName;
        this.supplyingPrice = supplyingPrice;
        this.availableDate = availableDate;
    }

    public GenericProduct(String productName, double supplyingPrice, LocalDate availableDate) {
        this.productName = productName;
        this.supplyingPrice = supplyingPrice;
        this.availableDate = availableDate;
    }

    @Override
    public String toString() {
        return " " +
                "[" + productName + "]" +
                //", availableDate=" + availableDate +
                ' ';
    }

    public String getProductName() {
        return this.productName;
    }

    @Override
    public double getPrice() {
        return this.supplyingPrice;
    }

    @Override
    public boolean getAvailability() {
        return LocalDate.now().isAfter(availableDate);
    }
}

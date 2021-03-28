package oop.advanced.homeWorkShopBasket;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainShop {
    public static Map<GenericProduct, Integer> list1 = new LinkedHashMap<>();
    public static Basket basket = new Basket();

    public static void main(String[] args) {
        GenericProduct product1 = new GenericProduct("Lapte", 1.0, LocalDate.of(2021, Month.FEBRUARY, 28));
        GenericProduct product2 = new GenericProduct("Miere", 2.0, LocalDate.of(2021, Month.APRIL, 28));
        GenericProduct product3 = new GenericProduct("Paine", 3.0, LocalDate.of(2021, Month.JANUARY, 01));
        GenericProduct product4 = new GenericProduct("Malai", 4.0, LocalDate.of(2021, Month.MARCH, 20));
        GenericProduct product5 = new GenericProduct("Paste", 5.0, LocalDate.of(2021, Month.MARCH, 15));
        GenericProduct product6 = new GenericProduct("Cafea", 6.0, LocalDate.of(2021, Month.MAY, 30));
        GenericProduct product7 = new GenericProduct("Cioco", 7.0, LocalDate.of(2020, Month.DECEMBER, 28));
        GenericProduct product8 = new GenericProduct("Bere", 9.0, LocalDate.of(2020, Month.NOVEMBER, 1));
        basket.addProduct(product1, 3);
        basket.addProduct(product2,3);
        basket.addProduct(product3, 3);
        basket.addProduct(product4, 4);
        basket.addProduct(product4, 4);
        basket.addProduct(product6, 1);
        basket.addProduct(product7, 1);
        basket.addProduct(product8, 1);

        basket.removeProduct(product2, 2);
        basket.removeProduct(product5, 10);

        System.out.println(basket);
        System.out.println("Cost total: " + basket.calculateTotal());
        System.out.println("Valoare totala: " + OrderService.totalPrice(basket));
    }


}

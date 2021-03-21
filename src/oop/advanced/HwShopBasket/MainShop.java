package oop.advanced.HwShopBasket;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class MainShop {
    public static Map<GenericProduct,Integer> list1 = new LinkedHashMap<>();
    public static Basket basket = new Basket();

    public static void main(String[] args) {
        /**
         * Write a method that returns the average of a list of integers using streams
         */
        List<Integer> integerList = new ArrayList<>();
        integerList = Arrays.asList(1,2,3,4,5,6,9);
        System.out.println(integerList.stream()
                        .mapToInt(value -> value)
                        .average()
                        .getAsDouble()
        );


        /**/
        GenericProduct product1 = new GenericProduct("Supplier1", "Lapte", 3.8, LocalDate.of(2021, Month.FEBRUARY, 28));
        GenericProduct product2 = new GenericProduct("Supplier1", "Miere", 30.0, LocalDate.of(2021, Month.APRIL, 28));
        GenericProduct product3 = new GenericProduct("Supplier1", "Paine", 1.8, LocalDate.of(2021, Month.JANUARY, 01));
        GenericProduct product4 = new GenericProduct("Supplier2", "Malai", 2.8, LocalDate.of(2021, Month.MARCH, 20));
        GenericProduct product5 = new GenericProduct("Supplier2", "Paste", 4.5, LocalDate.of(2021, Month.MARCH, 15));
        GenericProduct product6 = new GenericProduct("Supplier2", "Cafea", 19.0, LocalDate.of(2021, Month.MAY, 30));
        GenericProduct product7 = new GenericProduct("Supplier2", "CiocoCocos", 6.8, LocalDate.of(2020, Month.DECEMBER, 28));
        GenericProduct product8 = new GenericProduct("Supplier2", "Bere", 12.99, LocalDate.of(2020, Month.NOVEMBER, 1));
        basket.addProduct(product1,2);
        basket.addProduct(product2,3);
        basket.addProduct(product3,3);
        basket.addProduct(product4,4);
        basket.addProduct(product4,4);

        basket.removeProduct(product1,3);
        basket.removeProduct(product5,10);

        System.out.println(basket);

        /**/

        //addProductsInList();
        //basket.addListToBasket(list1);
        //basket.removeProduct(product1);


    }

    private static void addProductsInList() {
//        GenericProduct product1 = new GenericProduct("Supplier1","Lapte", 3.8, LocalDate.of(2021, Month.FEBRUARY,28));
//        GenericProduct product2 = new GenericProduct("Supplier1","Miere", 30.0, LocalDate.of(2021, Month.APRIL,28));
//        GenericProduct product3 = new GenericProduct("Supplier1","Paine", 1.8, LocalDate.of(2021, Month.JANUARY,01));
//        GenericProduct product4 = new GenericProduct("Supplier2","Malai", 2.8, LocalDate.of(2021, Month.MARCH,20));
//        GenericProduct product5 = new GenericProduct("Supplier2","Paste", 4.5, LocalDate.of(2021, Month.MARCH,15));
//        GenericProduct product6 = new GenericProduct("Supplier2","Cafea", 19.0, LocalDate.of(2021, Month.MAY,30));
//        GenericProduct product7 = new GenericProduct("Supplier2","CiocoCocos", 6.8, LocalDate.of(2020, Month.DECEMBER,28));
//        GenericProduct product8 = new GenericProduct("Supplier2","Bere", 12.99, LocalDate.of(2020, Month.NOVEMBER,1));
//
//        //basket.addProduct(product1);
//        list1 = Arrays.asList(product1, product2, product3, product4, product5, product6, product7, product8);
    }
}

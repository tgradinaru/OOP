package oop.advanced.HwShopBasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Basket {
    private HashMap<GenericProduct, AtomicInteger> products;

    //private Map<GenericProduct, AtomicInteger> products = new HashMap<>();

    public void addProduct(GenericProduct product, Integer quantity) {

        if (products.containsKey(product)) {
            products.get(product).getAndAdd(quantity);
        } else if (product.getAvailability()) {
            products.put(product, new AtomicInteger(quantity));
        }
    }

    public void removeProduct(GenericProduct product, Integer quantity) {
        if (!products.containsKey(product)) {
            System.out.println("Produsul " + product + "nu e in cos!");
        }
        if (products.containsKey(product) && products.get(product).get() <= quantity) {
            products.remove(product);
        }
        if (products.containsKey(product)) {
            products.get(product).getAndAdd(-quantity);
        }
    }


    public HashMap<GenericProduct,AtomicInteger> getProducts() {
        return products;
    }

    public double calculateTotal(){
        return this.products.entrySet()
                .stream()
                .mapToDouble(product -> product.getKey().getPrice() * product.getValue().doubleValue())
                .sum();
    }


    @Override
    public String toString() {
        return "Basket{" +
                "basketList=" + products +
                '}';
    }

    /*    public void addListToBasket(Map<GenericProduct, Integer> basketList){
        this.basketList = basketList.stream()
                .filter(genericProduct -> genericProduct.getAvailability())
                .collect(Collectors.toList());
    }*/
}

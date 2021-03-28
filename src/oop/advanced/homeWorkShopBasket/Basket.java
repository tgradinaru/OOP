package oop.advanced.homeWorkShopBasket;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Basket {
    private final HashMap<GenericProduct, AtomicInteger> basketList;

    public Basket() {
        this.basketList = new HashMap<>();
    }

    public void addProduct(GenericProduct product, Integer quantity) {
        if (basketList.containsKey(product)) {
            basketList.get(product).getAndAdd(quantity);
        } else if (product.getAvailability()) {
            basketList.put(product, new AtomicInteger(quantity));
        }
    }

    public void removeProduct(GenericProduct product, Integer quantity) {
        if (!basketList.containsKey(product)) {
            System.out.println("Produsul " + product + " nu e in cos (indisponibil furnizor/nu a fost adaugat in cos)");
        }
        if (basketList.containsKey(product) && basketList.get(product).get() <= quantity) {
            basketList.remove(product);
        }
        if (basketList.containsKey(product)) {
            basketList.get(product).getAndAdd(-quantity);
        }
    }

    public HashMap<GenericProduct, AtomicInteger> getProducts() {
        return basketList;
    }

    public double calculateTotal() {
        return this.basketList.entrySet()
                .stream()
                .mapToDouble(product -> product.getKey().getPrice() * product.getValue().doubleValue())
                .sum();
    }

    @Override
    public String toString() {
        return "Cos final: " + basketList;
    }
}

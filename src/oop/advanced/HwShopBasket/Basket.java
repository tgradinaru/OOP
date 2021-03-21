package oop.advanced.HwShopBasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Basket {
    private Map<GenericProduct, AtomicInteger> basketList = new HashMap<>();

    public void addProduct(GenericProduct product, Integer quantity) {

        if (basketList.containsKey(product)) {
            basketList.get(product).getAndAdd(quantity);
        } else if (product.getAvailability()) {
            basketList.put(product, new AtomicInteger(quantity));
        }
    }

    public void removeProduct(GenericProduct product, Integer quantity) {
        if (!basketList.containsKey(product)) {
            System.out.println("Produsul " + product + "nu e in cos!");
        }
        if (basketList.containsKey(product) && basketList.get(product).get() <= quantity) {
            basketList.remove(product);
        }
        if (basketList.containsKey(product)) {
            basketList.get(product).getAndAdd(-quantity);
        }
    }

/*    public void addListToBasket(Map<GenericProduct, Integer> basketList){
        this.basketList = basketList.stream()
                .filter(genericProduct -> genericProduct.getAvailability())
                .collect(Collectors.toList());
    }*/

    private Map<GenericProduct, AtomicInteger> retreiveProduct(GenericProduct product, AtomicInteger quantity) {
        return this.basketList;
    }



    public Map<GenericProduct, AtomicInteger> getBasketList() {
        Map<GenericProduct, AtomicInteger> returnedList = basketList;
        return returnedList;
    }


    @Override
    public String toString() {
        return "Basket{" +
                "basketList=" + basketList +
                '}';
    }
}

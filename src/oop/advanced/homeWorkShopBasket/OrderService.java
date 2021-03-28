package oop.advanced.homeWorkShopBasket;

public class OrderService {

    public static Double totalPrice(Basket basket) {
        return basket.getProducts().entrySet().stream()
                .map(product -> product.getKey().getPrice() * product.getValue().doubleValue())
                .reduce(0.0, Double::sum);
    }
}






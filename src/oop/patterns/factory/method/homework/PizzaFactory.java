package oop.patterns.factory.method.homework;

public class PizzaFactory {

    public Pizza getPizza(int numberFromMenu){
        if(numberFromMenu==1){
            return new Capriciosa();
        }
        if(numberFromMenu==2){
            return new Margherita();
        }
        return new FruttiDiMare();

    }
}

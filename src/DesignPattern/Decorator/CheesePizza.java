package DesignPattern.Decorator;

public class CheesePizza extends PizzaDecorator {

    CheesePizza(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String bakePizza() {
        return pizza.bakePizza() + " with cheese topping added";
    }

    @Override
    public String serve(int customerID) {
        return ("Serving pizza with cheese topping to customer :: " + customerID + " with cost :: " + cost());
    }

    public int cost() {
        return pizza.cost() + 100;
    }

}

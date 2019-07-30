package DesignPattern.Decorator;

public class VegPizza extends PizzaDecorator {

    VegPizza(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String bakePizza() {
        return pizza.bakePizza() + " with Veg topping added";
    }

    @Override
    public String serve(int customerID) {
        return ("Serving Veg Pizza to customer :: " + customerID + " with cost :: " + cost());
    }

    public int cost() {
        return pizza.cost() + 100;
    }

}

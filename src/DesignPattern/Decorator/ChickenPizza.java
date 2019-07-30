
package DesignPattern.Decorator;

public class ChickenPizza extends PizzaDecorator {

    public ChickenPizza(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String bakePizza() {
        return pizza.bakePizza() + " with Chicken topping added";
    }

    @Override
    public String serve(int customerID) {
        return ("Serving chicken Pizza to customer :: " + customerID + " with cost :: " + cost());
    }

    public int cost() {
        return pizza.cost() + 100;
    }

}

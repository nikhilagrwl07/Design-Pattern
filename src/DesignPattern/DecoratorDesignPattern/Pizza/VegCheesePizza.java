/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.DecoratorDesignPattern.Pizza;

/**
 *
 * @author nikhil.agrawal
 */
public class VegCheesePizza extends PizzaDecorator {
   
    public VegCheesePizza(Pizza newPizza) {
        super(newPizza);
    }
    
    @Override
    public String bakePizza() {
        return pizza.bakePizza() + " with Veg and cheese topping added";
    }

    public String serve(int customerID) {
       return ("Serving VegCheese Pizaa to customer :: " + customerID + " with cost :: "+ cost());
    }

    public int cost() {
        return 100;
    }

}

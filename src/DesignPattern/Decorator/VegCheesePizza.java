/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.Decorator;

/**
 *
 * @author nikhil.agrawal
 */
public class VegCheesePizza extends PizzaDecorator {
   
    VegCheesePizza(Pizza newPizza) {
        super(newPizza);
    }
    
    @Override
    public String bakePizza() {
        return pizza.bakePizza() + " with Veg and cheese topping added";
    }

    @Override
    public String serve(int customerID) {
       return ("Serving VegCheese Pizaa to customer :: " + customerID + " with cost :: "+ cost());
    }

    public int cost() {
        return pizza.cost()+100;
    }

}

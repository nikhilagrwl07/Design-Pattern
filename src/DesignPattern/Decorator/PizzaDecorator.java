/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.Decorator;

/**
 *
 * @author nikhil.agrawal
 */
public abstract class PizzaDecorator implements Pizza {
    
    Pizza pizza;
   
    PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }
    
    @Override
    public String bakePizza() {
        return pizza.bakePizza();
    }

    @Override
    public String serve(int customerID) {
        return "Serving pizza to customer id :: " + customerID;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.DecoratorDesignPattern.Pizza;

/**
 *
 * @author nikhil.agrawal
 */
public abstract class PizzaDecorator implements Pizza {
    
    Pizza pizza;
   
    public PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }
    
    @Override
    public String bakePizza() {
        return pizza.bakePizza();
    }
    
//    
//    public int cost() {
//        return 100;
//    }
//    
//    public String serve(int customerID)
//    {
//        return "Serving pizza to customer id :: " + customerID;
//    }

}

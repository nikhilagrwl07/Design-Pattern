/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.Decorator;

public abstract class PizzaDecorator implements Pizza {

    Pizza pizza;

    PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }
}

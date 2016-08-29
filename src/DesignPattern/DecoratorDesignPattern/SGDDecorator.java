/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.DecoratorDesignPattern;

public class SGDDecorator extends Decorator {

    Currency currency;
    double value;

    public SGDDecorator(Currency currency) {
        this.currency = currency;
    }

    public String getDescription(){
 
        return currency.getDescription()+" ,its singpore Dollar";
 }

    @Override
    public double cost(double value) {
        System.out.println("Inside cost of SGDDecorator !!! ");
        this.value=value;
        return this.value;
    }

}

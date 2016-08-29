/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.DecoratorDesignPattern;

public class USDDecorator extends Decorator {

    Currency currency;
    double value;

    public USDDecorator(Currency currency) {
        this.currency = currency;
    }

    public String getDescription(){
 
        return currency.getDescription()+" ,its US Dollar";
 }

    @Override
    public double cost(double value) {
        System.out.println("Inside cost of USDDecorator !!! ");
        this.value=value;
        return this.value;
    }

}

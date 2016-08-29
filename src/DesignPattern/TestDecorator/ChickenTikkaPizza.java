/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.TestDecorator;

import DecoratorDesignPattern.Pizza.*;

/**
 *
 * @author nikhil.agrawal
 */
public class ChickenTikkaPizza extends BasicPizza{
   
//    public ChickenTikkaPizza(Pizza newPizza) {
////        Pizza p = newPizza;
//        super(newPizza);
//    }

    @Override
    public String bakePizza() {
        return  " with Chicken topping added";
    }
    
  //  @Override
    @Override
    public String serve(int customerID){
        return ("Serving chickenTikka Pizaa to customer :: " + customerID + " with cost :: "+ cost());
    }

    @Override
    public int cost() {
        return 250;
    }   
    
}

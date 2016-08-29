
package DesignPattern.TestDecorator;

import DecoratorDesignPattern.Pizza.*;


public class Main {
    
    public static void main(String[] args) 
    {
        
        BasicPizza basicPizza = new BasicPizza();
        
        Pizza chickenpizza = new ChickenTikkaPizza();
        System.out.println(chickenpizza.serve(9451));
         System.out.println(chickenpizza.bakePizza());
 
        Pizza vegCheesePizza = new VegCheesePizza();
        System.out.println(vegCheesePizza.serve(0007));
    }

}

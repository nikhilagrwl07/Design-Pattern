
package DesignPattern.DecoratorDesignPattern.Pizza;


public class Main {
    
    public static void main(String[] args) 
    {
        
        BasicPizza basicPizza = new BasicPizza();     
        
        Pizza chickenpizza = new ChickenTikkaPizza(basicPizza);
        System.out.println(chickenpizza.serve(9451));
         System.out.println(chickenpizza.bakePizza());
 
        Pizza vegCheesePizza = new VegCheesePizza(basicPizza);
        System.out.println(vegCheesePizza.serve(0007));
    }

}

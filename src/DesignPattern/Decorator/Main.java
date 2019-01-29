
package DesignPattern.Decorator;


public class Main {
    
    public static void main(String[] args) 
    {
        
        BasicPizza basicPizza = new BasicPizza();     
        
        Pizza chickenpizza = new ChickenTikkaPizza(basicPizza);
        System.out.println(chickenpizza.serve(9451));
         System.out.println(chickenpizza.bakePizza());
         System.out.println(chickenpizza.cost());

        Pizza vegCheesePizza = new VegCheesePizza(basicPizza);
        System.out.println(vegCheesePizza.serve(0007));
        System.out.println(vegCheesePizza.cost());
    }

}

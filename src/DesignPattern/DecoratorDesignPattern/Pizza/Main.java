
package DesignPattern.DecoratorDesignPattern.Pizza;


public class Main {
    
    public static void main(String[] args) 
    {
        
//        BasicPizza basicPizza = new BasicPizza();
        
        Pizza chickenpizza = new ChickenTikkaPizza(new BasicPizza());
        System.out.println(chickenpizza.serve(9451));
         System.out.println(chickenpizza.bakePizza());
 
        Pizza vegCheesePizza = new VegCheesePizza(new BasicPizza());
        System.out.println(vegCheesePizza.serve(0007));


        // Please note that following is a
    }

}

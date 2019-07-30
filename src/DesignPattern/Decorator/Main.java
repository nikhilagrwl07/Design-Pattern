package DesignPattern.Decorator;

public class Main {

    public static void main(String[] args) {

        BasicPizza basicPizza = new BasicPizza();

        // Creating chicken pizza from basic pizza by passing to constructor at run time
        Pizza chickenpizza = new ChickenPizza(basicPizza);
        System.out.println(chickenpizza.serve(9451));
        System.out.println(chickenpizza.bakePizza());
        System.out.println(chickenpizza.cost());


        // Creating cheese from veg pizza
        Pizza cheesePizza = new CheesePizza(new VegPizza(basicPizza));
        // creating different objects at runtime by passing previous object in constructor

        System.out.println(cheesePizza.serve(0011));
        System.out.println(cheesePizza.cost());

    }

}

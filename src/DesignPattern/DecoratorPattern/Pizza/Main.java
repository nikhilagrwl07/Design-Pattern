package DesignPattern.DecoratorPattern.Pizza;


public class Main {
  public static void main(String[] args) {
    Pizza chickenpizza = new ChickenTikkaPizza(new BasicPizza());
    System.out.println(chickenpizza.serve(9451));
    System.out.println(chickenpizza.bakePizza());

    Pizza vegCheesePizza = new VegCheesePizza(new BasicPizza());
    System.out.println(vegCheesePizza.serve(0007));
  }
}

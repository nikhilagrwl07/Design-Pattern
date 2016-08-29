    
package DesignPattern.DecoratorDesignPattern;


 abstract class Currency{
    protected String description = "Unknown Currency";

    public String getDescription(){
        return description;
    }

    public abstract double cost(double value);

}

 // concrete component

 class Rupee extends Currency{
     double value;

     public Rupee()
     {
         description = "Indian Rupee";

     }
     public double cost(double v)
     {
         value = v;
         return value;
     }
 }

 //Another Concrete Component
class Dollar extends Currency
{
double value;

 public Dollar()
 {
  description = "Dollar";
 }

public double cost(double v)
{
    System.out.println("Inside cost function of Dollar class ");
   value=v;
  return value;

 }
}



public class DecoratorDesignPatternExample1 {
     public static void main(String[] args) {

         // Without decorator
         
         Currency curr = new Dollar();

         System.out.println(curr.getDescription() +" dollar. "+curr.cost(2.0));
         
          Currency ruppeCurr = new Rupee();

         System.out.println(ruppeCurr.getDescription() +" rupee. "+ruppeCurr.cost(2.0));

         
         // With decorator
         
    Currency curr2= new USDDecorator(new Dollar());
        
    System.out.println(curr2.getDescription() + " dollar. " + curr2.cost(4.0));
    
    curr2= new SGDDecorator(new Dollar());
    System.out.println(curr2.getDescription() + " dollar. " + curr2.cost(4.0));
    
         
    }


}

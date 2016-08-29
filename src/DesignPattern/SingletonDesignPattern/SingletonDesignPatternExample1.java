
package DesignPattern.SingletonDesignPattern;

class Singleton {

   private static final Singleton singleton = new Singleton( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private Singleton(){ }

   /* Static 'instance' method */
   public static Singleton getInstance( ) {
      return singleton;
   }
   /* Other methods protected by singleton-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for singleton");
   }
}


public class SingletonDesignPatternExample1
{
    public static void main(String[] args)
    {
          Singleton tmp = Singleton.getInstance( );
          tmp.demoMethod( );
    }

}


package DesignPattern.Singleton;

class SingletonWithEagerLoading {

   private static SingletonWithEagerLoading SINGLETON_WITH_EAGER_LOADING = new SingletonWithEagerLoading( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private SingletonWithEagerLoading(){ }

   /* Static 'instance' method */
   public static SingletonWithEagerLoading getInstance( ) {
      return SINGLETON_WITH_EAGER_LOADING;
   }
   /* Other methods protected by SINGLETON_WITH_EAGER_LOADING-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for SINGLETON_WITH_EAGER_LOADING");
   }
}
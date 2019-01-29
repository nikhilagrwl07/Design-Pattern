
package DesignPattern.Singleton;

class SingletonWithLazyLoading {

   private static SingletonWithLazyLoading SINGLETON_WITH_LAZY_LOADING;

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private SingletonWithLazyLoading(){ }

   /* Static 'instance' method */
   public static SingletonWithLazyLoading getInstance( ) {
      if(SINGLETON_WITH_LAZY_LOADING==null)
      {
         SINGLETON_WITH_LAZY_LOADING = new SingletonWithLazyLoading();
      }
      return SINGLETON_WITH_LAZY_LOADING;
   }
   /* Other methods protected by SINGLETON_WITH_LAZY_LOADING-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for SINGLETON_WITH_LAZY_LOADING");
   }
}
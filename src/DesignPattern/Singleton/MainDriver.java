package DesignPattern.Singleton;

public class MainDriver {
    public static void main(String[] args) {
        // Eager Loading
        SingletonWithEagerLoading tmp = SingletonWithEagerLoading.getInstance( );
        tmp.demoMethod( );

        // Eager Loading
        SingletonWithLazyLoading singletonWithLazyLoading = SingletonWithLazyLoading.getInstance( );
        singletonWithLazyLoading.demoMethod( );


        // Thread safe Enum class
        ThreadSafeEnumSingleton.INSTANCE.setCounter(10);
        System.out.println(ThreadSafeEnumSingleton.INSTANCE.getCounter());



    }
}

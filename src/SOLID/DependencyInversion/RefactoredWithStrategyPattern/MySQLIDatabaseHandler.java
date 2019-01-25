package SOLID.DependencyInversion.RefactoredWithStrategyPattern;

public class MySQLIDatabaseHandler implements IDatabaseHandler {

    @Override
    public void connect(){
        System.out.println("Connecting to MySQL database ...");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnecting to MySQL database ...");
    }
}

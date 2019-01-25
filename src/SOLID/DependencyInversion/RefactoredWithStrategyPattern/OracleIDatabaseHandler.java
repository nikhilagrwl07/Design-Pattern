package SOLID.DependencyInversion.RefactoredWithStrategyPattern;

public class OracleIDatabaseHandler implements IDatabaseHandler {

    public void connect(){
        System.out.println("Connecting to Oracle database ...");
    }

    public void disconnect(){
        System.out.println("Disconnecting to Oracle database ...");
    }
}

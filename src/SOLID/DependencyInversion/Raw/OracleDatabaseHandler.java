package SOLID.DependencyInversion.Raw;

import SOLID.DependencyInversion.RefactoredWithStrategyPattern.IDatabaseHandler;

public class OracleDatabaseHandler implements IDatabaseHandler {

    public void connect(){
        System.out.println("Connecting to Oracle database ...");
    }

    public void disconnect(){
        System.out.println("Disconnecting to Oracle database ...");
    }
}

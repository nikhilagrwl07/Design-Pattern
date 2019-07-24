package SOLID.DependencyInversion.Raw;

public class OracleDatabaseHandler implements IDatabaseHandler {

    public void connect(){
        System.out.println("Connecting to Oracle database ...");
    }

    public void disconnect(){
        System.out.println("Disconnecting to Oracle database ...");
    }
}

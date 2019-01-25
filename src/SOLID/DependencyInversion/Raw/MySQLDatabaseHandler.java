package SOLID.DependencyInversion.Raw;

public class MySQLDatabaseHandler {

    public void connect(){
        System.out.println("Connecting to MySQL database ...");
    }

    public void disconnect(){
        System.out.println("Disconnecting to MySQL database ...");
    }
}

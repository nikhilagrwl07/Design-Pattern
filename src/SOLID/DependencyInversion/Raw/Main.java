package SOLID.DependencyInversion.Raw;

public class Main {
    public static void main(String[] args) {

        DatabaseHandler mySQLDatabaseHandler = new DatabaseHandler();
        mySQLDatabaseHandler.connectToMysql();
        mySQLDatabaseHandler.disconnectFromMySQL();
    }
}

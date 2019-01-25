package SOLID.DependencyInversion.Raw;

public class DatabaseHandler {

    private MySQLDatabaseHandler mySQLDatabaseHandler;
    private OracleDatabaseHandler oracleDatabaseHandler;

    public DatabaseHandler() {
        mySQLDatabaseHandler = new MySQLDatabaseHandler(); // Higher level class (IDatabaseHandler) is fully dependent on lower level class (MySQLIDatabaseHandler)
        oracleDatabaseHandler = new OracleDatabaseHandler();
    }

    public void connectToMysql(){
        mySQLDatabaseHandler.connect();
    }


    public void disconnectFromMySQL(){
        mySQLDatabaseHandler.disconnect();
    }

    public void connectToOracle(){
        oracleDatabaseHandler.connect();
    }


    public void disconnectFromOracle(){
        oracleDatabaseHandler.disconnect();
    }
}

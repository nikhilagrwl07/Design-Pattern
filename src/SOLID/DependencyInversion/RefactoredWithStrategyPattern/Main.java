package SOLID.DependencyInversion.RefactoredWithStrategyPattern;

import SOLID.DependencyInversion.Raw.OracleDatabaseHandler;

public class Main {
    public static void main(String[] args) {
        IDatabaseHandler mySQLIDatabaseHandler = new MySQLIDatabaseHandler();
        DatabaseHandler databaseHandler = new DatabaseHandler(mySQLIDatabaseHandler);
        databaseHandler.connect();
        databaseHandler.disconnect();

        IDatabaseHandler oracleDatabaseHandler = new OracleDatabaseHandler();
        databaseHandler = new DatabaseHandler(oracleDatabaseHandler);
        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}

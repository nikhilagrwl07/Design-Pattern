package SOLID.DependencyInversion.RefactoredWithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        IDatabaseHandler mySQLIDatabaseHandler = new MySQLIDatabaseHandler();
        DatabaseHandler databaseHandler = new DatabaseHandler(mySQLIDatabaseHandler);
        databaseHandler.connect();
        databaseHandler.disconnect();

        OracleIDatabaseHandler oracleDatabaseHandler = new OracleIDatabaseHandler();
        databaseHandler = new DatabaseHandler(oracleDatabaseHandler);
        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}

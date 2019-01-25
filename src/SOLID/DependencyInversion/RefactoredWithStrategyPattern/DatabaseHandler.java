package SOLID.DependencyInversion.RefactoredWithStrategyPattern;

public class DatabaseHandler{

    private IDatabaseHandler databaseHandler;

    public DatabaseHandler(IDatabaseHandler iDatabaseHandler) {
        this.databaseHandler = iDatabaseHandler;
    }

    public void connect() {
        databaseHandler.connect();
    }

    public void disconnect() {
        databaseHandler.disconnect();
    }
}

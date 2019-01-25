package SOLID.DependencyInversion.RefactoredWithStrategyPattern;

public interface IDatabaseHandler {
    public void connect();
    public void disconnect();
}

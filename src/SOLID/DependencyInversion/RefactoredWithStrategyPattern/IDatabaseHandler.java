package SOLID.DependencyInversion.RefactoredWithStrategyPattern;

interface IDatabaseHandler {
    public void connect();
    public void disconnect();
}

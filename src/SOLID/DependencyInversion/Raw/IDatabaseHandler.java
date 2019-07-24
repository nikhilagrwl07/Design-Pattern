package SOLID.DependencyInversion.Raw;

interface IDatabaseHandler {
    public void connect();
    public void disconnect();
}

package DesignPattern.Singleton;

// Enum class are by default synchronized therefore it is thread-safe
public enum ThreadSafeEnumSingleton {

    INSTANCE;

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}

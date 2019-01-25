package SOLID.OpenClosed.RefactoredWithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        SortManager sortManager = new SortManager();
        sortManager.sort(new MergeSort());
        sortManager.sort(new BubbleSort());
    }
}

package SOLID.OpenClosed.RefactoredWithStrategyPattern;

public class BubbleSort implements Sorter {
    @Override
    public void sort() {
        System.out.println("Sorting according to bubble sort");
    }
}

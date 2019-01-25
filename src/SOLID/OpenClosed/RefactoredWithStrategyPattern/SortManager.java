package SOLID.OpenClosed.RefactoredWithStrategyPattern;

public class SortManager {

    public void sort(Sorter sorter){
        sorter.sort();
    }
}

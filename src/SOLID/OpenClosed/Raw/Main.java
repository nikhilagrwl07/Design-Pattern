package SOLID.OpenClosed.Raw;

public class Main {
    public static void main(String[] args) {
       SortManager sortManager = new SortManager();
       sortManager.sort(new MergeSort());
       sortManager.sort(new BubbleSort());

    }
}

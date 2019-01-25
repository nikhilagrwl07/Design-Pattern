package SOLID.OpenClosed.Raw;

public class BubbleSort extends Sorter {

    public BubbleSort() {
        super.sortType = SortType.BUBBLE_SORT;
    }

    @Override
    public void sort() {
        System.out.println("Sorting according to bubble sort");
    }
}

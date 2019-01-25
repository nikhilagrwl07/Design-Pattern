package SOLID.OpenClosed.Raw;

public class MergeSort extends Sorter {
    public MergeSort() {
        super.sortType = SortType.MERGE_SORT;
    }

    @Override
    public void sort() {
        System.out.println("Sorting according to merge sort");
    }
}

package SOLID.OpenClosed.Raw;

public class SortManager {

    public void sort(Sorter sorter){
        if(sorter.sortType==SortType.MERGE_SORT){
            sorter.sort();
        }

        if(sorter.sortType==SortType.BUBBLE_SORT){
            sorter.sort();
        }
    }
}

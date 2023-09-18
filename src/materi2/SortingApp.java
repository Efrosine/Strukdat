package materi2;

public class SortingApp {
    public static void main(String[] args) {
        int array[] = { 4, 9, 6, 12, 56, 98 };

        Sorting sort = new Sorting();
        sort.display("nilai awal", array);

        sort.bubleSort(array);
        // sort.selectionSort(array);
        // sort.insertionSort(array);

        // sort.bubbleDecentSort(array);
        // sort.bubbleDecentSort(array);
        // sort.bubbleDecentSort(array);

        sort.display("hasil", array);
    }
}

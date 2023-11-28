package praktikum9.praktikum;

public class HeapSortApp {

    public static void main(String[] args) {
        Heap HT = new Heap(35);
        HT.insert(45);
        HT.insert(95);
        HT.insert(35);
        HT.insert(65);
        HT.insert(25);
        HT.insert(55);
        HT.insert(75);
        HT.insert(15);
        HT.insert(125);
        HT.insert(115);
        HT.insert(85);
        HT.insert(105);

        HT.displayArray();

        HT.heapSort();

        HT.displayArray();
    }
}

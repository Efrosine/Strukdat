package praktikum9.pendahuluan;

public class HeapApp {
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

        // soal 1
        // HT.displayHeap();

        // soal 2
        // HT.displayHeapIndex();

        // soal 3
        HT.displayHeap();
        System.out.println("add 71");
        HT.insert(71);
        HT.displayHeap();
        // System.out.println("add 520");
        // HT.insert(520);
        // HT.displayHeap();

        // soal 4
        // HT.displayHeap();
        // System.out.println("remove " + HT.remove().getKey());
        // HT.displayHeap();

        // soal 5
        // HT.displayHeap();
        // System.out.println("change 115 to 61");
        // HT.change(1, 61);
        // HT.displayHeap();

        System.out.println(" ");

    }
}

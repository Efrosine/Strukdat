package praktikum2.pendahuluan;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);

        System.out.println("Array Awal");
        arr.display();

        System.out.println("bubble sort :");
        // arr.bubleSort();
        // System.out.println("Jumlah perbandingan : " + arr.nCompare);
        // System.out.println("Jumlah pergantian : " + arr.nSwap);

        // arr.bubleDecentSort();
        // arr.selectionSort();
        // arr.insertionSort();

        System.out.print("Hasil Sorting = ");
        arr.display();
    }
}

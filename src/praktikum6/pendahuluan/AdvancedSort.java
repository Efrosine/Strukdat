package praktikum6.pendahuluan;

public class AdvancedSort {
    public static void main(String[] args) {

        HighArray arr = new HighArray(10);
        int data[] = { 50, 89, 64, 12, 23, 94, 78, 3, };
        for (int temp : data) {
            arr.insert(temp);
        }
        System.out.print("Array belum terurut ");
        arr.display();

        // arr.shellSort();
        // System.out.print("Array telah terurut(n/2) ");

        // arr.shellSortKnuth();
        // System.out.print("Array telah terurut(knuth) ");

        arr.QuicSort();
        System.out.print("Array telah terurut(quick) ");

        arr.display();

    }
}

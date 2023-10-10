package praktikum6.pendahuluan;

public class ShellSort {
    public static void main(String[] args) {

        HighArray arr = new HighArray(10);
        int data[] = { 42, 89, 63, 12, 94, 27, 78, 3, 50, 36 };
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
        System.out.println("Array telah terurut(quick) ");

        arr.display();

    }
}

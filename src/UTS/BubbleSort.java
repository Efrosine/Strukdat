package UTS;

public class BubbleSort {

    private int[] arr;
    private int nElement;

    public BubbleSort(int max) {
        arr = new int[max];
    }

    public void insert(int value) {
        arr[nElement] = value;
        nElement++;
    }

    public void bubleSort() {
        int batas, i;
        for (batas = nElement - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] < arr[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void display() {
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort(9);
        int data[] = { 3, 4, 2, 6, 8, 9, 1, 7, 5 };
        for (int i : data) {
            bs.insert(i);
        }
        System.out.println("Sebelum Sort :");
        bs.display();

        System.out.println("Setelah Sort");
        bs.bubleSort();
        bs.display();
    }
}
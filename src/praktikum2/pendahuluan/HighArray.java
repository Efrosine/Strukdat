package praktikum2.pendahuluan;

public class HighArray {
    private int[] arr;
    private int nElement;
    int nCompare = 0, nSwap = 0;

    public HighArray(int max) {
        arr = new int[max];
        nElement = 0;

    }

    public void insert(int value) {
        arr[nElement] = value;
        nElement++;
    }

    public void display() {
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // ..... code high array sebelumnya
    public void bubleSort() {
        int batas, i;
        for (batas = nElement - 1; batas > 0; batas--) {
            // System.out.print("Cycle " + (nElement - batas) + " :\n");
            for (i = 0; i < batas; i++) {
                nCompare++;
                if (arr[i] > arr[i + 1]) {
                    nSwap++;
                    swap(i, i + 1);
                    // System.out.print("\t(" + arr[i] + "<>" + arr[i + 1] + ") ");
                    // display();
                }
            }
        }
    }

    public void bubleDecentSort() {
        int batas, i;
        for (batas = nElement - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] < arr[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }

    void selectionSort() {
        int awal, i, min;
        for (awal = 0; awal < nElement - 1; awal++) {
            min = awal;
            // System.out.print("Cycle " + (awal + 1) + " :\n");
            for (i = awal + 1; i < nElement; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            swap(awal, min);
            // System.out.print("\t(" + arr[awal] + "<>" + arr[min] + ") ");
            // display();
        }
    }

    void insertionSort() {
        int i, curIn;
        for (curIn = 1; curIn < nElement; curIn++) {
            int temp = arr[curIn];
            i = curIn;

            System.out.println("Pergeseran " + arr[i]);
            System.out.println("vvvvvvv");
            while (i > 0 && arr[i - 1] >= temp) {
                System.out.print("(" + arr[i - 1] + "<>" + arr[i] + ") ");
                arr[i] = arr[i - 1];
                display();
                i--;
            }
            arr[i] = temp;
            System.out.println("\nInsert " + temp);
            display();
            System.out.println("-----------------------");
        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}

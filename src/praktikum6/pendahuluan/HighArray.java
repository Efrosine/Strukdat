package praktikum6.pendahuluan;

public class HighArray {
    private int[] arr;
    private int nElement;

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

    public void shellSort() {
        int in, out;
        int temp;
        int h = nElement / 2;

        while (h > 0) {
            for (out = h; out < nElement; out++) {
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
                display();
            }
            System.out.println();
            h /= 2;
        }
    }

    public void shellSortKnuth() {
        int in, out;
        int temp;
        // perubahan terjadi
        int h = 1;
        while (h <= nElement / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (out = h; out < nElement; out++) {
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
                display();
            }
            System.out.println();
            // perubahan terjadi
            h = (h - 1) / 3;
        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void QuicSort() {
        reqQuickSort(0, nElement - 1);
    }

    public void reqQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            int pivot = arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            reqQuickSort(batasKiri, partisi - 1);
            reqQuickSort(partisi, batasKanan);
        }
    }

    private int partitionIt(int batasKiri, int batasKanan, int pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;

        while (true) {
            while (indexKiri < batasKanan && arr[++indexKiri] < pivot)
                ;
            while (indexKanan > batasKiri && arr[--indexKanan] > pivot)
                ;
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
                display();
            }
        }
        return indexKiri;
    }
}

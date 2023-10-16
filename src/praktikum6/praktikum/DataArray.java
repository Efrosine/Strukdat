package praktikum6.praktikum;

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElement;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElement = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElement] = new Mahasiswa(nim, nama, asal);
        nElement++;
    }

    public void displayArray() {
        for (int i = 0; i < nElement; i++) {
            mhs[i].displayMhs();
        }
    }

    public void swap(int one, int two) {
        // terjadi perubahan
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public void mergeSortNama() {
        // terjadi perubahan
        Mahasiswa[] workSpace = new Mahasiswa[nElement];
        recMergeSort(workSpace, 0, nElement - 1);
    }

    public void recMergeSort(Mahasiswa[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }

    }

    private void merge(Mahasiswa[] workSpace, int lowIndex, int highIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && highIndex <= upperBound) {
            // terjadi perubahan
            if (mhs[lowIndex].getNama().compareTo(mhs[highIndex].getNama()) < 0) {
                workSpace[j++] = mhs[lowIndex++];
            } else {
                workSpace[j++] = mhs[highIndex++];
            }
        }
        while (lowIndex <= mid) {
            workSpace[j++] = mhs[lowIndex++];
        }
        while (highIndex <= upperBound) {
            workSpace[j++] = mhs[highIndex++];
        }
        for (j = 0; j < nItem; j++) {
            mhs[lowerBound + j] = workSpace[j];
        }
    }

    public void shellSortKnuthNim() {
        int in, out;
        // terjadi perubahan
        Mahasiswa temp;
        int h = 1;
        while (h <= nElement / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (out = h; out < nElement; out++) {
                temp = mhs[out];
                in = out;
                // terjadi peruhan
                while (in > h - 1 && mhs[in - h].getNim() >= temp.getNim()) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public void QuicSortNama() {
        reqQuickSort(0, nElement - 1);
    }

    public void reqQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            // terjadi perubahan
            Mahasiswa pivot = mhs[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            reqQuickSort(batasKiri, partisi - 1);
            reqQuickSort(partisi, batasKanan);
        }
    }

    private int partitionIt(int batasKiri, int batasKanan, Mahasiswa pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;

        // terjadi perubahan
        while (true) {
            while (indexKiri < batasKanan && mhs[++indexKiri].getNama().compareTo(pivot.getNama()) < 0)
                ;
            while (indexKanan > batasKiri && mhs[--indexKanan].getNama().compareTo(pivot.getNama()) > 0)
                ;
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);

            }
        }
        return indexKiri;
    }

}

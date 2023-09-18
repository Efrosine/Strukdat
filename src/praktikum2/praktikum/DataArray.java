package praktikum2.praktikum;

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

    // ....code DataArray sebelumnya
    public void bubleSort() {
        int batas, i;
        for (batas = nElement - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
                    swap(i, i + 1);
                }
            }
        }
    }

    void selectionSort() {
        int awal, i, min;
        for (awal = 0; awal < nElement - 1; awal++) {
            min = awal;

            for (i = awal + 1; i < nElement; i++) {
                if (mhs[i].getNim() < mhs[min].getNim()) {
                    min = i;
                }
            }
            swap(awal, min);

        }
    }

    void insertionSortByName() {
        int i, curIn;
        for (curIn = 1; curIn < nElement; curIn++) {
            Mahasiswa temp = mhs[curIn];
            i = curIn;

            while (i > 0 && (mhs[i - 1].getNama().compareTo(temp.getNama()) > 0)) {
                mhs[i] = mhs[i - 1];
                i--;
            }
            mhs[i] = temp;
        }
    }

    public void swap(int one, int two) {
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
}

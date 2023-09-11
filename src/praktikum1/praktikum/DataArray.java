package praktikum1.praktikum;

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElelment;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElelment = 0;
    }

    public Mahasiswa find(long searchNim) {
        int i;
        for (i = 0; i < nElelment; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElelment) {
            return null;
        } else {
            return mhs[i];
        }
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElelment] = new Mahasiswa(nim, nama, asal);
        nElelment++;
    }

    public boolean delete(long searchNim) {
        int i;
        for (i = 0; i < nElelment; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElelment) {
            return false;
        } else {
            for (int j = i; j < nElelment; j++) {
                mhs[j] = mhs[j + 1];
            }
            nElelment--;
            return true;
        }
    }

    public void displayArray() {
        for (int i = 0; i < nElelment; i++) {
            mhs[i].displayMhs();
        }
    }
}

package praktikum1.pendahuluan;

public class HighArray { // awal sebuah class bernama HighArray
    private int[] arr; // deklarasi array integer bernama arr
    private int nElement; // deklarasi var intger nElement

    public HighArray(int max) {
        arr = new int[max];
        nElement = 0; // membuat contructor untuk inisiasi class property

    }

    public void insert(int value) {
        arr[nElement] = value; // menambahkan element ke array sesuai urutan penambahan
        nElement++;// menambahkan hitungan element yang telah ditambah
    }

    public boolean find(int key) { // fungsi untuk mencari element didalam array
        int i; // deklarasi var integer i
        for (i = 0; i < nElement; i++) { // perulangan untuk setiap element array
            if (arr[i] == key) { // kondisi untuk mencari element
                break; // menghentikan looping jika element ditemukan
            }
        }
        if (i == nElement) {
            return false;
        } else { // return value jika element ditemukan atau tidak
            return true;
        }
    }

    public boolean delete(int value) { // fungsi untuk menghapus element array
        int i;
        for (i = 0; i < nElement; i++) {
            if (value == arr[i]) {
                break;
            }
        } // algoritma untuk mencari suatu element sama seperti fungsi find()
        if (i == nElement) {
            return false; // value jika element tidak ditemukan
        } else { // jika value ditemukan
            for (int j = i; j < nElement; j++) {
                arr[j] = arr[j + 1];// maka element tujuan ditimpa dengan element kanannya
            }
            nElement--; // jumlah element dikurangi
            return true; // value jika element berhasil di hapus
        }

    }

    public void display() { // fungsi untuk menampilkan element array
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i] + " ");
        } // menampilkan array dengan menampilkan element satu persatu
        System.out.println("");
    }

    // ...code dari highclass
    public int size() {
        return nElement;
    }// fungsi untuk mengembalikan value dari banyaknya element

}

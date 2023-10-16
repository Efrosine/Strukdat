package praktikum6.praktikum;

public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(202300270, "Jundi", "Malang");
        arr.insert(202300230, "Ahmad", "Jogja");
        arr.insert(202300280, "Sofi", "Sidoarjo");
        arr.insert(202300260, "Helmi", "Bayuwangi");
        arr.insert(202300220, "Alpin", "Ambon");
        arr.insert(202300240, "Agung", "Madiun");
        arr.insert(202300250, "Bagas", "Malang");
        arr.insert(202300000, "Radi", "Batu");
        arr.insert(202300210, "Zainal", "Surabaya");

        System.out.println("Data Mahasiswa Sebelum Diurutkan");
        arr.displayArray();

        System.out.println("\nSorting(Merge sort by nama)");
        arr.mergeSortNama();
        arr.displayArray();

        System.out.println("\n Sorting(Shell sort by nim)");
        arr.shellSortKnuthNim();
        arr.displayArray();

        System.out.println("Sorting(Quick sort by nama)");
        arr.QuicSortNama();
        arr.displayArray();

    }
}
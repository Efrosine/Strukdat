package praktikum2.praktikum;

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

        // System.out.Srt();
        // System.out.println("\nSorting(selection) by NIM");
        // arr.selectionSort();

        // arr.displayArray();

        System.out.println("\nSorting(insertion) by Name");
        arr.insertionSortByName();

        arr.displayArray();

    }
}
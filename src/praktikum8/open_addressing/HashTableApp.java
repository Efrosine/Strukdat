package praktikum8.open_addressing;

public class HashTableApp {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable(15);
        hashTable.insert(89);
        hashTable.insert(7);
        hashTable.insert(61);
        hashTable.insert(17);
        hashTable.insert(31);
        hashTable.insert(43);
        hashTable.insert(29);
        hashTable.insert(37);
        hashTable.insert(79);
        hashTable.insert(97);
        hashTable.displayTable();

        // data baru yang ditambah di main
        hashTable.insert(11);
        hashTable.insert(23);
        hashTable.insert(47);
        hashTable.insert(53);
        hashTable.insert(71);
        hashTable.displayTable();

        Data find = hashTable.findNew(72);
        if (find == null)
            System.out.println("Data tidak ditemukan");
        else
            System.out.println("Data ditemukan : " + find.getKey());

        // Data delete = hashTable.delete(71);
        // if (delete == null)
        // System.out.println("Data Tidak Ada");
        // else
        // System.out.println("Data Terhapus : " + delete.getKey());

        // hashTable.displayTable();
    }
}

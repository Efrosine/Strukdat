package praktikum8.open_addressing;

public class HashTableApp {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable(17);
        hashTable.insertQuadratic(89);
        hashTable.insertQuadratic(7);
        hashTable.insertQuadratic(61);
        hashTable.insertQuadratic(17);
        hashTable.insertQuadratic(31);
        hashTable.insertQuadratic(43);
        hashTable.insertQuadratic(29);
        hashTable.insertQuadratic(37);
        hashTable.insertQuadratic(79);
        hashTable.insertQuadratic(97);
        hashTable.displayTable();

        // data baru yang ditambah di main
        hashTable.insertQuadratic(11);
        hashTable.insertQuadratic(23);
        hashTable.insertQuadratic(47);
        hashTable.insertQuadratic(53);
        hashTable.insertQuadratic(71);
        hashTable.displayTable();

        // Data find = hashTable.find(71);
        // if (find == null)
        // System.out.println("Data tidak ditemukan");
        // else
        // System.out.println("Data ditemukan : " + find.getKey());

        // Data delete = hashTable.delete(71);
        // if (delete == null)
        // System.out.println("Data Tidak Ada");
        // else
        // System.out.println("Data Terhapus : " + delete.getKey());

        // hashTable.displayTable();
    }
}

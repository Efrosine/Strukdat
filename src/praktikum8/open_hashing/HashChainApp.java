package praktikum8.open_hashing;

public class HashChainApp {
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

        hashTable.insert(11);
        hashTable.insert(23);
        hashTable.insert(47);
        hashTable.insert(53);
        hashTable.insert(71);
        hashTable.displayTable();

    }
}
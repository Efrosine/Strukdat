package praktikum8.open_addressing;

public class HashTable {
    private Data[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int i = 0; i < size; i++) {
            if (hashArray[i] != null) {
                System.out.println("| " + i + "\t| " + hashArray[i].getKey() + " ");
            } else {
                System.out.println("| " + i + "\t| -- |");
            }
        }
        System.out.println();
    }

    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(int data) {
        Data item = new Data(data);
        int key = item.getKey();
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            ++hashVal;
            hashVal %= size;
        }
        hashArray[hashVal] = item;
    }

    // create a new insert method that implement quadratic probing

    public void insertQuadratic(int data) {
        Data item = new Data(data);
        int key = item.getKey();
        int hashVal = hashFunc(key);
        int i = 0;
        while (hashArray[hashVal] != null) {
            ++i;
            hashVal = (hashFunc(key) + i * i) % size;
        }
        hashArray[hashVal] = item;
    }

    public void insertnew(int data) {
        Data item = new Data(data);
        int key = item.getKey();
        int hashVal = hashFunc(key);
        int startIndex = hashVal;
        do {
            if (hashArray[hashVal] == null) {
                hashArray[hashVal] = item;
                return;
            }
            ++hashVal;
            hashVal %= size;
        } while (hashVal != startIndex); // stop if we've gone full circle
        throw new RuntimeException("Hash table is full"); // or return an error message

    }

    public Data delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

    public Data find(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }
}

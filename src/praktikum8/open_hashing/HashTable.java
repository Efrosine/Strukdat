package praktikum8.open_hashing;

public class HashTable {
    private SortedLInkedList[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new SortedLInkedList[size];
        for (int i = 0; i < size; i++) {
            hashArray[i] = new SortedLInkedList();
        }
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + ". ");
            hashArray[i].displayList();
        }
        System.out.println();
    }

    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(int data) {
        Link theLink = new Link(data);
        int key = data;
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key) {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public Link find(int key) {
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }
}
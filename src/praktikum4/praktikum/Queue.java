package praktikum4.praktikum;

public class Queue {
    private int maxSize;
    private LinkedList quaArray;
    private int front;

    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        front = 0;
        quaArray = new LinkedList();
        nItems = 0;
    }

    public void insert(Record value) {
        quaArray.insertLast(value);
        nItems++;
    }

    public Record remove() {
        nItems--;
        return quaArray.deteleFirst().Data;
    }

    public Record peekFront() {
        return quaArray.find(front).Data;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void displayLink() {
        quaArray.displayList();
    }
}

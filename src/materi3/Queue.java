package materi3;

public class Queue {
    private int maxSize;
    private char[] quaArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        quaArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(char value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        quaArray[++rear] = value;
        nItems++;
    }

    public char remove() {
        char temp = quaArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public char peekFront() {
        return quaArray[front];
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
}

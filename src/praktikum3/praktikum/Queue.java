package praktikum3.praktikum;

public class Queue {
    private int maxSize;
    private String[] quaArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        quaArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        quaArray[++rear] = value;
        nItems++;
    }

    public String remove() {
        String temp = quaArray[front++];
        quaArray[front - 1] = "Kosong";
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public String peekFront() {
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

    public void getAntrian() {
        StringBuffer result = new StringBuffer();
        int dummy = front;
        for (int i = 0; i < maxSize; i++) {
            if (dummy == maxSize) {
                dummy = 0;
            }
            result.append(quaArray[dummy++] + ", ");
        }
        System.out.println(result.toString());
    }
}

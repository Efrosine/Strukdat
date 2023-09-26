package praktikum4.praktikum;

public class Stack {
    private int maxSize;
    private LinkedList stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new LinkedList();
        top = -1;
    }

    public void push(Record item) {
        stackArray.insertFirst(item);
        top++;
    }

    public Record pop() {
        top--;
        return stackArray.deteleFirst().Data;

    }

    public Record peek() {
        return stackArray.find(top).Data;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize);
    }

    public void displayLink() {
        stackArray.displayList();
    }
}

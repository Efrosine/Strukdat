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

    public void displayLink() {
        stackArray.displayList();
    }
}

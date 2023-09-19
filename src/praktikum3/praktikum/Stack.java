package praktikum3.praktikum;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char item) {
        stackArray[++top] = item;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

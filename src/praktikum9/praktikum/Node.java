package praktikum9.praktikum;

public class Node {
    private int data;

    public Node(int key) {
        data = key;
    }

    public int getKey() {
        return data;
    }

    public void setKey(int key) {
        data = key;
    }

    public String displayNode(int index) {
        return "[" + data + "-" + index + "]";
    }

}

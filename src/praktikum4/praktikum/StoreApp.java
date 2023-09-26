package praktikum4.praktikum;

public class StoreApp {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);

        theStack.push(new Record(1, "VCD"));
        theStack.push(new Record(2, "TV"));

        theStack.displayLink();

        theStack.push(new Record(3, "Kulkas"));
        theStack.push(new Record(4, "PC"));
        theStack.push(new Record(5, "Rice Cooker"));
        theStack.push(new Record(6, "Dispanser"));

        theStack.displayLink();

        theStack.pop();
        theStack.pop();

        theStack.displayLink();
    }
}

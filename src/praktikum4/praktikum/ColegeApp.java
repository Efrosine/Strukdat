package praktikum4.praktikum;

public class ColegeApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(10);
        theQueue.insert(new Record(1655100, "Dee"));
        theQueue.insert(new Record(1655200, "Deaja"));
        theQueue.displayLink();
        theQueue.insert(new Record(1655300, "Ami"));
        theQueue.insert(new Record(1655400, "Haya"));
        theQueue.insert(new Record(1655500, "Yati"));
        theQueue.displayLink();
        theQueue.remove();
        theQueue.remove();
        theQueue.displayLink();
    }
}

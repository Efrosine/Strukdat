package praktikum4.pendahuluan;

public class LinkD {
    public int Data;
    public LinkD next;
    public LinkD previous;

    public LinkD(int Data) {
        this.Data = Data;
    }

    public void displayLink() {
        System.out.print(Data + " ");
    }
}

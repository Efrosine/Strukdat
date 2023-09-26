package praktikum4.praktikum;

public class Link {

    public Record Data;
    public Link next;

    public Link(Record Data) {
        this.Data = Data;
    }

    public void displayLink() {
        System.out.println(Data.toString());
    }

}

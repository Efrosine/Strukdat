package praktikum1.praktikum;

public class Praktikum1App {
    public static void main(String[] args) {
        Praktikum1 arr = new Praktikum1(10);
        arr.insert(15);
        arr.insert(30);
        arr.insert(45);
        arr.insert(53);
        arr.insert(77);
        arr.insert(79);
        arr.insert(81);
        arr.display();

        arr.insert(66);

        arr.display();
    }
}

package praktikum1.praktikum;

public class Praktikum2App {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Praktikum2 binary = new Praktikum2();
        int result = binary.search(array, -11);

        if (result == -1) {
            System.out.println("Target Missing");
        } else {
            System.out.println("Index di = " + result);
        }
    }
}

package UTS;

public class Segitiga {
    public int triangle(int n) {
        return n == 1 ? 1 : n + triangle(n - 1);
    }

    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        for (int i = 1; i <= 10; i++) {
            int result = sg.triangle(i);
            System.out.print(result + ", ");
        }
    }
}

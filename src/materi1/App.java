package materi1;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 30, 55, 70, 100 };

        int sumA = 0;
        for (int temp : a) {
            sumA += temp;
        }
        System.out.println("Jumlah element A = " + sumA);
        int sumB = 0;
        for (int temp : b) {
            sumB += temp;
        }
        System.out.println("Jumlah element B = " + sumB);

        System.out.println();

        System.out.println("Banyak element A = " + a.length);
        System.out.println("Banyak element B = " + b.length);

        int c[] = new int[4];
        for (int i = 0; i < b.length; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println();
        for (int temp : c) {
            System.out.print(temp + ",");
        }
    }
}

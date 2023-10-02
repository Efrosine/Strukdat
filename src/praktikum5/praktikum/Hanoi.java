package praktikum5.praktikum;

public class Hanoi {
    int nLoop = 0;

    public void doMenara(int n, char asal, char tujuan, char bantuan) {
        nLoop++;
        if (n == 1) {
            System.out.println("Cakram " + n + " dari " + asal + " ke " + tujuan);
            return;
        }
        doMenara(n - 1, asal, bantuan, tujuan);
        System.out.println("Cakram " + n + " dari " + asal + " ke " + tujuan);
        doMenara(n - 1, bantuan, tujuan, asal);
    }

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.doMenara(5, 'A', 'B', 'C');
        System.out.println("Terjadi " + hanoi.nLoop + " Proses pemindahan");
    }
}

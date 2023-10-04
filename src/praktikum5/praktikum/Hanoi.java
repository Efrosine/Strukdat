package praktikum5.praktikum;

import java.util.Scanner;

public class Hanoi {
    int nLoop = 0;

    public void doMenara(int n, char a, char b, char c) {
        nLoop++;
        if (n == 1) {
            System.out.println("Cakram " + n + " dari " + a + " ke " + c);
            return;
        }
        doMenara(n - 1, a, c, b);
        System.out.println("Cakram " + n + " dari " + a + " ke " + c);
        doMenara(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah cakram = ");
        int n = sc.nextInt();
        Hanoi hanoi = new Hanoi();
        hanoi.doMenara(n, 'A', 'B', 'C');
        System.out.println("Terjadi " + hanoi.nLoop + " Proses pemindahan");
        sc.close();
    }
}

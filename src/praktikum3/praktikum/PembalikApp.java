package praktikum3.praktikum;

import java.util.Scanner;

public class PembalikApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "";

        while (!s.equalsIgnoreCase("q")) {
            System.out.print("Masukkan Kata\t\t: ");
            s = sc.nextLine();
            Pembalik thePembalik = new Pembalik(s);
            thePembalik.setWord();

            System.out.print("Hasil Kata Terbalik\t: ");
            System.out.println(thePembalik.getWord());
            System.out.println("----------------");
        }

        sc.close();
    }

}

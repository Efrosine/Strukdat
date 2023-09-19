package materi3;

import java.util.Scanner;

public class KonversiBinar {
    public static void main(String[] args) {

        System.out.println("---Konversi binary---");

        Scanner sc = new Scanner(System.in);
        Stack theStack = new Stack(100);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        while (angka > 0) {
            int temp = angka % 2;
            angka = angka / 2;
            theStack.push(temp);
        }

        System.out.print("Hasil konversi : ");
        while (!theStack.isEmpty()) {
            int temp = theStack.pop();
            System.out.print(temp + ", ");
        }
        sc.close();
    }
}

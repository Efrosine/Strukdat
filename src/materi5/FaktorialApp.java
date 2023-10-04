package materi5;

import java.util.Scanner;

public class FaktorialApp {
    public static void main(String[] args) {
        Faktorial fak = new Faktorial();

        Scanner sc = new Scanner(System.in);

        int num = 1;
        while (num > 0) {
            System.out.print("Masukkan angkanya : ");
            num = sc.nextInt();
            int resultIter = fak.fakIter(num);
            int resultRecur = fak.fakRecur(num);

            System.out.println("Iteration of " + num + "! = " + resultIter);
            System.out.println("Recurtion of " + num + "! = " + resultRecur);
        }
        sc.close();
    }
}

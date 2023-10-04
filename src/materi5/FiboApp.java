package materi5;

import java.util.Scanner;

public class FiboApp {

    public static void main(String[] args) {
        Fibo fak = new Fibo();

        Scanner sc = new Scanner(System.in);

        long num = 1;
        while (num > 0) {
            System.out.print("Masukkan angkanya : ");
            num = sc.nextLong();
            long resultIter = fak.fiboIter(num);
            long resultRecur = fak.fiboRecur(num);

            System.out.println("Iteration of " + num + " = " + resultIter);
            System.out.println("Recurtion of " + num + " = " + resultRecur);
        }
        sc.close();
    }
}

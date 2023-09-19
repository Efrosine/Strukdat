package materi3;

import java.util.Scanner;

public class QueueApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue theQueue = new Queue(100);

        System.out.print("input keyboard : ");
        String data = sc.nextLine();

        char arr[] = data.toCharArray();
        for (char c : arr) {
            theQueue.insert(c);
        }

        while (!theQueue.isEmpty()) {
            char temp = theQueue.remove();
            System.out.print(temp + ", ");
        }

        sc.close();
    }
}

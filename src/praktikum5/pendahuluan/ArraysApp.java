package praktikum5.pendahuluan;

import java.util.HashSet;
import java.util.Random;

public class ArraysApp {
    public static void main(String[] args) {
        HashSet<Integer> uniqueRand = new HashSet<Integer>();
        Random rand = new Random();
        int[] randArr = new int[10];
        while (uniqueRand.size() < 10) {
            int randNum = rand.nextInt(10) + 1;
            if (uniqueRand.add(randNum)) {
                randArr[uniqueRand.size() - 1] = randNum;
            }
        }

        Arrays arrays = new Arrays(10);

        for (Integer integer : randArr) {
            arrays.insert(integer);
        }

        System.out.print("Array sebelum sort : ");
        arrays.display();

        arrays.mergeSort();
        System.out.print("Array setelah sort : ");
        arrays.display();

    }
}

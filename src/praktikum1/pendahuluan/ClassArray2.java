package praktikum1.pendahuluan;

public class ClassArray2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int nElement = 0;
        array[0] = 30;
        array[1] = 20;
        array[2] = 60;
        array[3] = 70;
        array[4] = 50;
        array[5] = 10;
        nElement = 6;

        for (int i = 0; i < nElement; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
}

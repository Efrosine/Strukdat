package praktikum1.praktikum;

public class Praktikum1 {
    private int arr[];
    private int nElelment;

    public Praktikum1(int max) {
        arr = new int[max];
        nElelment = 0;
    }

    public void insert(int value) {
        int i = 0;
        for (; i < nElelment; i++) {
            if (value < arr[i]) {
                break;
            }
        }
        if (nElelment == arr.length) {
            System.out.print("Kepanjangan");
        } else {
            int j = nElelment;
            while (j >= i) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[i] = value;
            nElelment++;
        }
    }

    public void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

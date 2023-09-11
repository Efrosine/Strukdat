package praktikum1.praktikum;

public class Praktikum2 {
    private int bawah, tengah, atas;

    public int search(int arr[], int target) {
        bawah = 0;
        atas = arr.length - 1;

        while (bawah <= atas) {
            tengah = bawah + (atas - bawah) / 2;

            System.out.println("bawah " + bawah + " tengah " + tengah + " atas " + atas);
            if (arr[tengah] == target) {
                return tengah;
            }
            if (arr[tengah] < target) {

                bawah = tengah + 1;
            } else {
                atas = tengah - 1;
            }
        }
        System.out.println("bawah " + bawah);
        System.out.println("atas " + atas);
        return -1;
    }
}

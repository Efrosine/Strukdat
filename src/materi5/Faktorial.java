package materi5;

public class Faktorial {
    public int fakIter(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int fakRecur(int n) {
        return n <= 1 ? 1 : n * fakRecur(n - 1);
    }
}

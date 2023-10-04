package praktikum5.pendahuluan;

public class TriangularNumber {
    public int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            System.out.println("Iter -> " + result + " + " + i);
            result += i;
        }
        return result;
    }

    public int triangleRecur(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println("Recur -> " + n + " + " + (n - 1));
            return n + triangleRecur(n - 1);
        }
    }

    public int fakIter(int n) {
        int result = n;
        for (int i = n; i > 1;) {
            result *= (--i);
        }
        return result;
    }

    public int fakRecur(int n) {
        return n == 1 ? 1 : n * fakRecur(n - 1);
    }
}

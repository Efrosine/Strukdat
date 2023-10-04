package materi5;

public class Fibo {
    long fiboIter(long n) {
        long f1 = 1, f2 = 1, fibo = 0;

        if (n == 1 || n == 2)
            fibo = 1;
        else {
            for (long i = 2; i < n; i++) {
                fibo = f1 + f2;
                f1 = f2;
                f2 = fibo;
            }
        }
        return fibo;
    }

    long fiboRecur(long n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return fiboRecur(n - 1) + fiboRecur(n - 2);
    }
}

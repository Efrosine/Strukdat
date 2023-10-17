package UTS;

public class Fibo {
    int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Fibo fb = new Fibo();

        for (int i = 1; i <= 10; i++) {
            int result = fb.fibo(i);
            System.out.print(result + ", ");
        }

    }
}

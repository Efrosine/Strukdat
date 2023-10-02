package praktikum5.praktikum;

public class Exp {
    public int eksponen(int base, int exp) {
        return exp == 0 ? 1 : base * eksponen(base, exp - 1);
    }

    public static void main(String[] args) {
        Exp e = new Exp();

        int a = e.eksponen(2, 10);
        int b = e.eksponen(3, 5);
        int c = e.eksponen(3, 16);
        System.out.println("2^10 = " + a);
        System.out.println("3^5 = " + b);
        System.out.println("3^16 = " + c);
    }

}

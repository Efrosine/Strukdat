package praktikum5.pendahuluan;

public class TriangularNumberApp {
    public static void main(String[] args) {
        TriangularNumber triangle = new TriangularNumber();

        int n = 5;
        int iter = triangle.triangleIter(n);
        int recur = triangle.triangleRecur(n);

        System.out.println("Iteration of " + n + " = " + iter);
        System.out.println("Recurtion of " + n + " = " + recur);

        int fakIter = triangle.fakIter(n);
        int fakRecur = triangle.fakRecur(n);
        System.out.println("Itteration of " + n + "! = " + fakIter);
        System.out.println("Recurtion of " + n + "! = " + fakRecur);
    }
}

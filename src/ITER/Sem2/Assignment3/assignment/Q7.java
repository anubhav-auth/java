package ITER.Sem2.Assignment3.assignment;

public class Q7 {
    static int factorial(int n) {
        if (n == 1) return n;
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
    }

}

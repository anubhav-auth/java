package ITER.Sem2.Assignment3.Homeassignment;

public class Q1 {
    static int gcd(int m, int n){
        if (m == 1 || n == 1) return 1;
        else if (m==0) return n;
        else if (n == 0) return m;
        else return gcd(n , m%n);
    }

    public static void main(String[] args) {
        System.out.println(gcd(28,34));
    }
}

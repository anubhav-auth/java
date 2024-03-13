package ITER.Sem2.Assignment1.homeAssignment;

public class Q3 {
    public static void main(String[] args) {

    }
    static int[] dotProduct(int[] a, int[] b){

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * b[i];
        }

        return a;
    }
}

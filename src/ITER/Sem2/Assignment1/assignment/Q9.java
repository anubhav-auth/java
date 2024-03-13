package ITER.Sem2.Assignment1.assignment;

public class Q9 {
    public static void main(String[] args) {

    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }

        return sum;

    }
}

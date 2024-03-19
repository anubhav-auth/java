package ITER.Sem2.Assignment1.homeAssignment;

public class Q4 {
    public static void main(String[] args) {

        
    }
    public static double[][] addMatrix(double[][] a, double[][] b){

        if (a.length == b.length && a[0].length == b[0].length) {

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = a[i][j] + b[i][j];
                }
            }
            return a;
        }
        
        return null;
    }
}

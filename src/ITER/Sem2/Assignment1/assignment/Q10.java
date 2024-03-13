package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 3;
        int c = 4;
        double [] [] ar = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {


                ar[i][j] = sc.nextDouble();
            }
        }

        System.out.println(sumColumn(ar , 2));
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;

        for (double[]a  : m){
            sum += a[columnIndex];
        }

        return sum;
    }
}

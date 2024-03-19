package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows and columns of 2d array");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double [] [] ar = new double[r][c];

        System.out.println("enter the elements of 2d array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ar[i][j] = sc.nextDouble();
            }
        }
        System.out.println("sum of elements of major diagonal " + sumMajorDiagonal(ar) );
    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }

        return sum;

    }
}

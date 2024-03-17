package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row ");
        int r = sc.nextInt();
        System.out.println("enter column ");
        int c = sc.nextInt();
        double [] [] ar = new double[r][c];
        System.out.println("enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ar[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < c; i++){
            System.out.println(sumColumn(ar , i));
        }

    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;

        for (double[]a  : m){
            sum += a[columnIndex];
        }

        return sum;
    }
}

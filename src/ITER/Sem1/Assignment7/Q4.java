package ITER.Sem1.Assignment7;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double [] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.print("The minimum number is: " + min(arr));
    }
    public static double min(double[] array){
        Double min = array[0];
        for (double i:array) {
            if (i < min) min = i;
        }
        return min;
    }
}

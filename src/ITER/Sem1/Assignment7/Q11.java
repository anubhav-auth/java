package ITER.Sem1.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        System.out.print("Enter elements of array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("\nSorted array is: "+ Arrays.toString(bubSort(arr)));

    }
    public static double[] bubSort(double [] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;


    }
}


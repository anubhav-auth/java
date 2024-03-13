package ITER.Sem2.Assignment1.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows and columns of 2d array");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [] [] ar = new int[r][c];
        int sum = 0;

        System.out.println("enter the elements of 2d array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int temp = sc.nextInt();
                sum += temp;
                ar[i][j] = temp;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("sum of all elements of 2d array is " + sum);

    }
}

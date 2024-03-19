package ITER.Sem2.Assignment1.homeAssignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a  = new int[n];
        int [] b  = new int[n];

        System.out.println("enter elements for array a");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter elements for array b");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        a = dotProduct(a,b);

        for(int i:a)
            System.out.print(i + " ");
    }
    static int[] dotProduct(int[] a, int[] b){

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * b[i];
        }
        return a;

    }
}

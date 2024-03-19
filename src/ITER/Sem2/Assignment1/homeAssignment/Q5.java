package ITER.Sem2.Assignment1.homeAssignment;

import java.util.Arrays;
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {

        int []a = ran01Mat(4);

        System.out.println("the largest row index " + a[0]);
        System.out.println("the largest column index " + a[1]);

    }
    public static int[] ran01Mat(int dim){
        int [][] a = new int[dim][dim];
        int [] fin = new int[2];
        int [] r = new int[dim];
        int [] c = new int[dim];

        Random ra = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length ; j++) {
                a[i][j] = ra.nextInt(2);
            }
        }

        for (int[] i : a)
            System.out.println(Arrays.toString(i));

        int sum = 0;
        int in = 0;

        for (int[] i: a){
            for (int j : i) {
                sum += j;
            }
            r[in++] = sum;
            sum = 0;
        }

        in = 0;

        for (int i = 0; i < a.length; i++) {
            for (int[] j : a){
                sum += j[i];
            }
            c[in++] = sum;
            sum = 0;
        }

        fin[0] = max(r);
        fin[1] = max(c);
        return fin;
    }

    static int max(int[] ar){
        int max = ar[0];
        int in = 0;
        for (int i = 0; i <ar.length ; i++) {
            if (ar[i] > max) {
                max = ar[i];
                in = i;
            }
        }
        return in;
    }
}

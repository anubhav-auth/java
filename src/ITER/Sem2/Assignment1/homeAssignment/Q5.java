package ITER.Sem2.Assignment1.homeAssignment;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {

        int [][]a = ran01Mat(4);

        int max = 0;
        int sum = 0;
        int counter = 0;

//        for ()

    }
    public static int[][] ran01Mat(int dimension){
        int [][] a = new int[dimension][dimension];
        Random ra = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length ; j++) {
                a[i][j] = ra.nextInt(2);
            }
        }
        return a;
    }
}

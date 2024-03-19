package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array: ");
        int n = sc.nextInt();
        int [] ar = new int[n];
        int max = ar[0];
        int min = Integer.MAX_VALUE;
        int maxin = 0;
        int minin = 0;
        int countermax = 0;
        int countermin = 0;
        boolean c = false;

        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n ; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] > max) max = ar[i];
            if (ar[i] < min) min = ar[i];
        }

        for (int i = 0; i < n; i++) {
            if (ar[i] == max) {
                countermax ++;
                if (!c){
                    maxin = i;
                    c = true;
                }
            }

            if (ar[i] == min) {
                countermin ++;
                minin = i;
            }

        }
        System.out.println("max element is " + max + " occurs " + countermax + " times");
        System.out.println("min element is " + min + " occurs " + countermin + " times");
        System.out.println("first occurence of max is at " + maxin);
        System.out.println("first occurence of min is at " + minin);






    }

}

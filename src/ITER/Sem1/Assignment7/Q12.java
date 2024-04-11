package ITER.Sem1.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements of array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nSorted array is: "+ Arrays.toString(selSort(arr)));

    }
    public static int[] selSort(int [] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int ind = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[ind]) {
                    ind = j;
                }
            }

            int temp = arr[ind];
            arr[ind] = arr[i];
            arr[i] = temp;
        }

        return arr;


    }
}
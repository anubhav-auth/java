package ITER.Sem1.Assignment7;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        int max = array[0];
        int secLast= array[0]-1;
        for (int i:array) {
            if (i > max) {
                secLast = max;
                max = i;
            } else if (i >secLast && i < max) {
                secLast = i;
            }
        }
        System.out.println("Second largest array element is: " + secLast);// 23565
    }
}

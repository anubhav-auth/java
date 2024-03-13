package ITER.Sem1.Assignment7;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        System.out.print("Enter 10 elements for array: ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter number to search for: ");
        int k = sc.nextInt();
        int counter = 0;
        for (int i : a) {
            if (i == k) counter++;
        }
        System.out.println(((counter > 0) ? k+" exists " + counter + " times." : k+ " doesnt exist."));
    }
}

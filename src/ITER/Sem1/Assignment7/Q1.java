package ITER.Sem1.Assignment7;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.print("Enter size of array: ");
        int a = sc.nextInt();
        int [] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = ra.nextInt(100);
        }
        int sum = 0;
        System.out.print("Generated Array is: ");
        for (int i :arr) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of elements is: " + sum);
        System.out.println("Average of elements is: " + sum/(double)arr.length);

    }
}

package ITER.Sem1.Assignment3.assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number:");
        int first = sc.nextInt();
        System.out.print("Input second number:");
        int second = sc.nextInt();
        System.out.print("Input third number:");
        int third = sc.nextInt();

        if (first<second && second<third) {
            System.out.println("Increasing");
        }
        else if (first> second && second> third) {
            System.out.println("Decreasing");
        }else {
            System.out.println("Neither increasing nor decreasing");
        }
    }
}

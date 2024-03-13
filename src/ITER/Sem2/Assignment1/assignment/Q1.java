package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number greater than 2");

        int a = sc.nextInt();

        int counter = 0;

        while (a>2) {
            counter++;
            a /=2;
        }
        System.out.println("the number of times is: " + counter);
    }
}

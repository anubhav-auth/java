package ITER.Sem1.Assignment3.assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to caste your vote.");
        }
        else {
            System.out.println("You are not eligible to caste your vote.");
        }
    }
}

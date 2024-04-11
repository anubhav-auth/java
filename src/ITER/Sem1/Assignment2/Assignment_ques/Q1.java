package ITER.Sem1.Assignment2.Assignment_ques;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit");
        double temp = sc.nextDouble();
        double celsius_temp = (temp - 32) * (5.0/9);
        System.out.println(celsius_temp);
    }
}

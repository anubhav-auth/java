package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double w = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double h = sc.nextDouble();

        double bmi = w/Math.pow(h, 2);

        if(bmi<18.5)System.out.println("underweight");
        else if (bmi<24.9)System.out.println("normal weight");
        else if (bmi<25.9)System.out.println("over weight");
        else System.out.println("obese");
    }
}

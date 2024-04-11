package ITER.Sem1.Assignment2.Assignment_ques;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int basic = sc.nextInt();

        double DA = (40.0/100)*basic;
        double HRA = (20.0/100)*basic;
        double gross = basic + DA + HRA;
        System.out.println("DA is " + DA);
        System.out.println("HRA is " + HRA);
        System.out.println("gross is " + gross);
    }
}

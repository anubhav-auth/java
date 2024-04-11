package ITER.Sem1.Assignment2.HomeAssignment2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of minutes");
        int min = sc.nextInt();
        int days = (min/60)/24;
        int remainder = days%365;
        int years = (days-remainder)/365;
        System.out.println(min+ " minutes is approximately " + years + " years and " + remainder + " days." );
    }
}

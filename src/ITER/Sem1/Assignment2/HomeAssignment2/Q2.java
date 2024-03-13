package ITER.Sem1.Assignment2.HomeAssignment2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of eggs you have");
        int eggs = sc.nextInt();
        int x = eggs%144;
        int left = x%12;
        int dozen = (x-left)/12;
        int gross = (eggs-x)/144;

        System.out.println("your number of eggs is "+ gross+ " gross, "+ dozen+ " dozen, and " + left + ".");
    }
}

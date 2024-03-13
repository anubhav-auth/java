package ITER.Sem1.Assignment6.homeAssignments;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println("Check whether the three said numbers are consecutive or not! " + checkConsecutive(a, b, c));
        
    }

    public static boolean checkConsecutive(int a, int b, int c) {
        if (b == ++a) {
            return c == ++b;
        }else return false;
    }


}

package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q6 {
    public static boolean isOdd(int n){

        String s = Integer.toBinaryString(n);
        return s.charAt(s.length() - 1) == '1';

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        System.out.println(isOdd(sc.nextInt()));
    }
}

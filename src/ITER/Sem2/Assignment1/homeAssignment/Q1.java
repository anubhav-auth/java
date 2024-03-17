package ITER.Sem2.Assignment1.homeAssignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        check(a,b,c);
    }
    static boolean check(int a, int b, int c){
        return ((a+b == c) || (a == b-c) || (a*b == c));
    }
}

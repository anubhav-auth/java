package ITER.Sem1.Assignment5.assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        if (m < n && m > 0){
            for (int i = m; i <= n ; i++) {
                int fac = 1;
                for (int j = i; j > 0; j--) {
                    fac *= j;
                }
                System.out.println("Factorial of " + i + " is: " + fac);
            }
        }
    }
}

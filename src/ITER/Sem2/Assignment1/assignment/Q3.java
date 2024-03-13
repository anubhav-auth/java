package ITER.Sem2.Assignment1.assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int n = sc.nextInt();

        int pro = 1;
        int sum = 0;

        while(n>0) {
            int temp = n%10;

            sum += temp;
            pro *= temp;

            n /= 10;
        }

        if (sum == pro) System.out.println("it is a spy number");
        else System.out.println("itws not a spy number");
    }
}

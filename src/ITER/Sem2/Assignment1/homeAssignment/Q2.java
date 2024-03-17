package ITER.Sem2.Assignment1.homeAssignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of lines :");
        int n = sc.nextInt();
        String []s = new String[n];

        sc.nextLine();
        System.out.println("enter sentences: ");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        System.out.println(" \nreversed is \n");
        for (int i = n-1; i >=0 ; i--) {
            System.out.println(s[i]);
        }
    }

}

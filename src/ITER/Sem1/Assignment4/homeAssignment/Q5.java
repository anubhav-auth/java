package ITER.Sem1.Assignment4.homeAssignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("For input, N = ");
        int N = sc.nextInt();
        String ruler = " ";
        for (int i = 1; i <= N ; i++) {
            ruler = ruler+i+ruler;
            System.out.println(ruler);
        }
        System.out.println();
    }
}

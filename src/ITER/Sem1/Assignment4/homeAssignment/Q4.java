package ITER.Sem1.Assignment4.homeAssignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("For input, N = ");
        int N = sc.nextInt();
        int sum = 0;
        int sum1 = 1;
        for (int i = 0; i <= N ; i++) {
            if (i%2==0){
                sum = sum + i;
            }
        }
        for (int j = 0; j <= N ; j++) {
            if (j%2!=0){
                sum1 = sum1 * j;
            }
        }
        System.out.println("Sum of all even numbers = "+sum);
        System.out.println("Product of all odd numbers = "+sum1);
    }
}

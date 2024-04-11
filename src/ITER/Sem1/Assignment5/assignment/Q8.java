package ITER.Sem1.Assignment5.assignment;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int finsum = 0;
        for (int i = 1; i <= n; i++){
            int tempsum = 0;
            for (int j = 1; j <= i; j++) {
                tempsum += j;
            }
            finsum += tempsum;
        }
        System.out.println("The value is: " + finsum);
    }
}

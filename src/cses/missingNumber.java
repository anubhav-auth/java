package cses;

import java.util.Scanner;

public class missingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n-1];

        int checker = 0;

        while (checker <= n-2){
            array[checker] = sc.nextInt();
            checker++;
        }

        int sum = 0;

        for (int a : array) {
            sum += a;
        }

        int sum2 = 0;

        while (n != 0){
            sum2 += n;
            n--;
        }
        System.out.println(sum2 - sum);

    }

}

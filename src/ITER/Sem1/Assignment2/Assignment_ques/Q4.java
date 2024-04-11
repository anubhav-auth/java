package ITER.Sem1.Assignment2.Assignment_ques;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number between 0 and 1000");
        int num = sc.nextInt();
        int x = 0;
        int sum = 0;
        x = num % 10;
        num = num / 10;
        sum += x;
        x = num % 10;
        num = num / 10;
        sum += x;
        x = num % 10;
        num = num / 10;
        sum += x;
        System.out.println("The sum of the digits is " + sum);
    }
}

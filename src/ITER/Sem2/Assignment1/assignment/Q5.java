package ITER.Sem2.Assignment1.assignment;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum;

        do {
            sum = sum_Of_Digits(n);
            n = sum;

        }while(sum>=9);

        System.out.println(sum);

    }

    static int sum_Of_Digits(int n) {
        int sum = 0;
        while(n>0) {
            int temp = n%10;
            sum += temp;
            n/=10;
        }

        return sum;
    }
}

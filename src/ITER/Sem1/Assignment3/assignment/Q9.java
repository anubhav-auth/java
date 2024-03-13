package ITER.Sem1.Assignment3.assignment;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a, b, c: ");
        int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt();


        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid;
        System.out.println(max + " is the largest among " +a+ ", " +b+ ", " +c);

        if(max>a && min<a) {
            mid = a;
        }else if(max>b && min<b) {
            mid = b;
        }else {
            mid = c;
        }
        System.out.println(mid + " is the second largest among " +a+ ", " +b+ ", " +c);
    }
}

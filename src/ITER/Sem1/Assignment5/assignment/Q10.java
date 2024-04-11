package ITER.Sem1.Assignment5.assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        if(n>3){
            System.out.print("The sequence is: " + a + " "  + b + " " + c + " ");
            for (int i = 1; i <= n ; i++) {
                int d = a + b + c;
                a = b;
                b = c;
                c = d;
                System.out.print(d + " ");
            }
        }
    }
}

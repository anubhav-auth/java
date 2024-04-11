package ITER.Sem1.Assignment5.homeAssignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you need(n): ");
        int n = sc.nextInt();
        int a  = 0, b = 1,c;
        if (n == 1){
            System.out.print("For n = "+ n +", it will display as: Fibonacci Series is: "+ a + " ");
        } else{
            System.out.print("For n = "+ n +", it will display as: Fibonacci Series is: "+ a + " " + b + " ");
            for (int i = 0; i <= n-3; i++){
                c = a+b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }


    }
}

package ITER.Sem1.Assignment5.homeAssignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter values of x for Cos(x): ");
        double x = Math.toRadians(sc.nextDouble());
        double val = Math.cos(x);
        double err = 1/1000000d;
        double sum = 0;
        double error;
        sum += ((Math.pow(x,0)) - (Math.pow(x,2)/factorial(2)));
        error = val - sum;
        int i = 4;

        while (error > err){
            sum += ((Math.pow(x,i)/factorial(i)) - (Math.pow(x,i+2)/factorial(i+2)));
            error = val - sum;
            i += 2;
        }
        System.out.println("The original value is: " + val);
        System.out.println("The calculated value with acceptable error(10^-6): " + sum);

    }
    static long factorial(int num){
        long val = 1;
        for (int i = num; i >= 2 ; i--) {
            val  = val* i;
        }
        return val;
    }
}

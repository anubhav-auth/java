package ITER.Sem1.Assignment7;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 double values for array: ");
        double [] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("The standard deviation is: " + deviation(arr));
    }

    public static double deviation(double[] x) {
        System.out.println("The mean is: " + mean(x));
        double sum = 0;

        for(double i : x) {
            sum += (Math.pow( (i-mean(x)), 2));
        }
        double f = Math.sqrt(sum / (x.length-1));
        return f;
    }

    public static double mean(double[] x) {
        double sum = 0;
        for(double i: x) {
            sum += i;
        }
        return sum/x.length;
    }
}


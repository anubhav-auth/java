package ITER.Sem1.Assignment2.Assignment_ques;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        double time = sc.nextDouble();
        double d = 0.5*32.174*Math.pow(time,2);
        System.out.println("Distance travelled " + d);
    }
}

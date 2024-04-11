package ITER.Sem1.Assignment2.Assignment_ques;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the radius of the hemisphere: ");
        double radius = sc.nextDouble();
        double area = 3 * Math.PI * Math.pow(radius,2);
        double volume = (2/3.0)*Math.PI*Math.pow(radius,3);

        System.out.println("The surface area of the hemisphere: " + area);
        System.out.println("The volume area of the hemisphere: " + volume);
    }
}

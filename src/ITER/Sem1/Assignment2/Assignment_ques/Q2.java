package ITER.Sem1.Assignment2.Assignment_ques;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in KM = ");
        int distance = sc.nextInt();

        System.out.println(distance + " km is " + (distance*1000) + " meters");
        System.out.println(distance + " km is " + (distance*3280.8399) + " feet");
        System.out.println(distance + " km is " + (distance*39370.0787) + " inches");
        System.out.println(distance + " km is " + (distance*100000) + " centimeters");
    }
}

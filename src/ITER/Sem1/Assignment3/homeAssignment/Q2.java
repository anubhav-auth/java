package ITER.Sem1.Assignment3.homeAssignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter today's day: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int v = sc.nextInt();

        switch(n){
            case 0 -> System.out.print("Today is Sunday");
            case 1 -> System.out.print("Today is Monday");
            case 2 -> System.out.print("Today is Tuesday");
            case 3 -> System.out.print("Today is Wednesday");
            case 4 -> System.out.print("Today is Thursday");
            case 5 -> System.out.print("Today is Friday");
            case 6 -> System.out.print("Today is Saturday");
        }
        v = (v+n)%7;
        switch(v){
            case 0 -> System.out.print(" and the future day is Sunday");
            case 1 -> System.out.print(" and the future day is Monday");
            case 2 -> System.out.print(" and the future day is Tuesday");
            case 3 -> System.out.print(" and the future day is Wednesday");
            case 4 -> System.out.print(" and the future day is Thursday");
            case 5 -> System.out.print(" and the future day is Friday");
            case 6 -> System.out.print(" and the future day is Saturday");
        }

    }
}

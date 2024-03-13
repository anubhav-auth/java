package ITER.Sem1.Assignment3.homeAssignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your gender (M or F): ");
        char gender = sc.next().charAt(0);
        System.out.print("First name: ");
        String firstName = sc.next();
        System.out.print("Last name: ");
        String lastName = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();


        if (gender == 'M' || gender == 'm') {
            if (age > 20){
                System.out.println("Then I shall call you Mr. " + firstName + " " + lastName + "."  );
            }else {
                System.out.println("Then I shall call you " + firstName + " " + lastName + "."  );
            }

        }else {
            if (age > 20){
                System.out.print("Are you married, "+firstName+" (y or n)? ");
                char marriage = sc.next().charAt(0);
                if (marriage == 'y' || marriage == 'Y') {
                    System.out.println("Then I shall call you Mrs. " + firstName + " " + lastName + "."  );
                }else {
                    System.out.println("Then I shall call you Ms. " + firstName + " " + lastName + "."  );

                }
            }else {
                System.out.println("Then I shall call you " + firstName + " " + lastName + "."  );

            }
        }
    }
}
//    What is your gender (M or F): F
//        First name: Gita
//        Last name: Pattanayak
//        Age: 32
//        Are you married, Gita (y or n)? y
//        Then I shall call you Mrs. Gita Pattanayak.
package ITER.Sem1.Assignment3.homeAssignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computerChoice = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userChoice = scanner.nextInt();

        if (computerChoice == userChoice) {
            System.out.println("It is a draw.");
        } else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }
    }
}

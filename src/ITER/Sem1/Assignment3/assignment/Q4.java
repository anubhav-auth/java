package ITER.Sem1.Assignment3.assignment;
import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int com = ra.nextInt(9) + 1;
        System.out.print("Enter user number: ");
        int guess = sc.nextInt();
        System.out.println("Computer guesses: " + com );
        if (guess == com){
            System.out.println("You got it right");
        } else if (guess == (com+1) || guess == (com-1)){
            System.out.println("Almost got it");
        }else {
            System.out.println("You got it wrong");
        }


    }
}

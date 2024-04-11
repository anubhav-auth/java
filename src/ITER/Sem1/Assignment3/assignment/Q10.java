package ITER.Sem1.Assignment3.assignment;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");

        int mark = sc.nextInt();

        switch(mark/10) {
            case (10):
            case (9):
                System.out.println("The grade is O");
                break;
            case (8):
                System.out.println("The grade is A");
                break;
            case (7):
                System.out.println("The grade is B");
                break;
            case (6):
                System.out.println("The grade is C");
                break;
            case (5):
                System.out.println("The grade is D");
                break;
            case (4):
                System.out.println("The grade is E");
                break;
            default:
                System.out.println("THe grade is F");
        }
    }

}

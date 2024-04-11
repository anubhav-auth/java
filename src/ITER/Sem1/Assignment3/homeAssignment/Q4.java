package ITER.Sem1.Assignment3.homeAssignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        boolean f = false;

        if (n%5 == 0 && n%6 == 0){
            System.out.println("Is "+n+" divisible by 5 and 6? true");
        }else System.out.println("Is "+n+" divisible by 5 and 6? false");

        if (n%5 == 0 || n%6 == 0){
            System.out.println("Is "+n+" divisible by 5 or 6? true");
        }else System.out.println("Is "+n+" divisible by 5 and 6? false");

        if ((n%5 == 0 || n%6 == 0) && !(n%5 == 0 && n%6 == 0)){
            System.out.println("Is "+n+" divisible by 5 or 6, but not both? True");
        }else {
            System.out.println("Is "+n+" divisible by 5 or 6, but not both? false");
        }
    }
}

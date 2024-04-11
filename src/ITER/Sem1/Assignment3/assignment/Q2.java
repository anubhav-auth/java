package ITER.Sem1.Assignment3.assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of water consumed today:");
        int intake = sc.nextInt();
        if (intake>= 5000){
            System.out.println("Yes, Alice is following doctor's advice");
        }
        else {
            System.out.println("No, Alice is not following doctor's advice");
        }
    }
}

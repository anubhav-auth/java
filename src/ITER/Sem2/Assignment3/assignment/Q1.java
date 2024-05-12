package ITER.Sem2.Assignment3.assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter no");
            int n = sc.nextInt();
            if(n<0) {
                throw new NumberFormatException();
            }
            else {
                System.out.println("Lucky number is " + n);
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid input");
        }
    }
}

package ITER.Sem1.Assignment5.assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first and second number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Prime numbers between " + a + " " + b +" are ");
        for (int i = a; i <= b ; i++) {
            if (Math.pow(2, i-1)%i == 1){
                System.out.print(i + " ");
            }
        }
//        boolean c = true;
//        for (int j = 2 ; j <= (int)Math.sqrt(i) ; j++) {
//            if (i % j == 0){
//                c = false;
//                break;
//            }
//        }
//        if (c) System.out.print(i +  " ");

    }
}

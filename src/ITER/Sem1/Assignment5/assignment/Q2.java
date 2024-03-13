package ITER.Sem1.Assignment5.assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        boolean b = true;

        for (int i = 2 ; i <= (int)Math.sqrt(a) ; i++) {
            if (a % i == 0){
                b = false;
                break;
            }
        }


        if (b){
            int c  = a;
            String s = "";
            while (c!=0) {
                int temp = c%10;
                s += temp;
                c/=10;
            }
            int d = Integer.parseInt(s);


            boolean e = true;
            for (int i = 2 ; i <= (int)Math.sqrt(d) ; i++) {
                if (d % i == 0){
                    e = false;
                    break;
                }
            }
            if (e){
                System.out.println(a + " is a twisted prime.");
            }else System.out.println(a + " is not a twisted prime.");
        }

    }
}

package ITER.Sem1.Assignment3.assignment;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();


        if(a == 0 && b == 0){
            System.out.println("(" + a +", " + b + ") is at origin");

        }else if(a>0 && b>0) {
            System.out.println("(" + a +", " + b + ") is in quadrant I");

        }else if(a<0 && b<0){
            System.out.println("(" + a +", " + b + ") is in quadrant III");

        }else if(a>0 && b<0){
            System.out.println("(" + a +", " + b + ") is in quadrant IV");

        }else if (a < 0 && b > 0){
            System.out.println("(" + a +", " + b + ") is in quadrant II");

        }else if(b == 0.0) {
            System.out.println("(" + a +", " + b + ") is on the x-axis");

        }else {
            System.out.println("(" + a +", " + b + ") is on the y-axis");
        }
    }

}

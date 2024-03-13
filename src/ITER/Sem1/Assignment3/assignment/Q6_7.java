package ITER.Sem1.Assignment3.assignment;
import java.util.Scanner;
public class Q6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No.of units consumed: ");
        int units = sc.nextInt();

        double price;
        double disc = 0;

        if(units <= 50) {
            price = units*3;
        }else if(units <= 200) {
            price = 50*3 + ((units-50)*4.80);
        }else if(units <= 400) {
            price = 50*3 + 150*4.80 + ((units-200)*5.80);
        }else {
            price = 50*3 + 150*4.80 + 200*5.80 + ((units-400)*6.20);
        }


        System.out.print("Do you want to pay online(y/n): ");
        char a = sc.next().charAt(0);

        System.out.println("Total amount : " + price);

        if(a == 'y' || a == 'Y') {
            disc = 0.03 * price;
            price = price - (0.03 * price);

        }

        System.out.println("Discount: " + disc);

        System.out.println("Amount payble: " + price);
    }
}


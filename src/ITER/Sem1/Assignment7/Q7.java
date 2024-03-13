package ITER.Sem1.Assignment7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal value you wanna convert to octal: ");
        int n = sc.nextInt();
        System.out.print("\n" + convertToOctal(n));
    }
    public static String convertToOctal(int decimalValue) {
        boolean decIsNegative = false;
        int a = decimalValue;

        if (decimalValue < 0) {
            a *= -1;
            decIsNegative = true;
        }

        if (decimalValue == 0) {
            return "0";
        }

        String str = "";

        while (a > 0) {
            int remainder = a % 8;
            str = remainder + str;
            a /= 8;
        }
        if (decIsNegative) {
            str = "-" + str;
        }

        return str;
    }

}

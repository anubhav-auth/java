package ITER.Sem1.minorProject1;

import java.util.Scanner;

public class Problem2_ConvertToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal value you want to convert: ");
        int dec = sc.nextInt();
        System.out.print("Enter the base you wanna convert to(upto base-62):- ");
        int base = sc.nextInt();
        String result = convertToAnyBase(dec, base);
        System.out.println("Decimal " + dec + " in base " + base + ": " + result);
    }


    public static String convertToAnyBase(int decimalValue, int base) {

        if (base < 2 || base > 62) {
            return "Enter a valid base from 2 to 62";
        }

        if (base == 2) return Integer.toBinaryString(decimalValue);
        boolean decIsNegative = false;
        int a = decimalValue;

        if (decimalValue < 0) {
            a *= -1;
            decIsNegative = true;
        }

        if (decimalValue == 0) {
            return "0";
        }

        char[] baseDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

        String str = "";

        while (a > 0) {
            int remainder = a % base;
            str = baseDigits[remainder] + str;
            a /= base;
        }
        if (decIsNegative) {
            str = "-" + str;
        }

        return str;
    }

}

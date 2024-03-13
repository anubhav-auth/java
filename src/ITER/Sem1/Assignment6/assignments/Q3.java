package ITER.Sem1.Assignment6.assignments;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check in palindrome or not: ");
        int n = sc.nextInt();
        System.out.println("The number "+ n + " is a palindrome -> "+ isPalindrome(n));
    }
    public static int reverse(int number){
        int n = number;
        String s = "";
        while (n != 0){
            int temp = n%10;
            s += temp;
            n /= 10;
        }
        return Integer.parseInt(s);
    }

    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
}

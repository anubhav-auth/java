package ITER.Sem1.Assignment6.assignments;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.print("Enter char to be found in the string: ");
        char c = sc.next().charAt(0);
        System.out.println("No.of occurance of "+c+ " is: " + count(s,c));
    }
    public static int count(String str, char a){
        char [] b = str.toCharArray();
        int counter = 0;

        for (int i = 0; i < b.length; i++){
            if (a == b[i]){
                counter++;
            }
        }
        return counter;
    }
}

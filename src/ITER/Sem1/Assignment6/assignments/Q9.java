package ITER.Sem1.Assignment6.assignments;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (checkPass(s)) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }
    public static boolean checkPass(String str){
        char []c = str.toCharArray();

        if (c.length < 8)return false;

        int counter = 0;

        for (int i = 0; i < c.length; i++){

            if (!Character.isDigit(c[i]) || !Character.isLetter(c[i])) return false;

            if (Character.isDigit(c[i])) counter++;

        }
        if (counter < 2 ) return false;

        return true;
    }
}

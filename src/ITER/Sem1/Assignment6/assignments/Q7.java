package ITER.Sem1.Assignment6.assignments;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("No.of vowels in "+s+ " is: " + count(s));
    }
    public static int count(String str){
        char [] b = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < b.length; i++){
            if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i'|| b[i] == 'o'|| b[i] == 'u'){
                counter++;
            }
        }
        return counter;
    }
}

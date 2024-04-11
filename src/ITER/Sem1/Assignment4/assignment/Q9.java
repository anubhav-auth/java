package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer number: ");
		int n = sc.nextInt(), a = n;
		String s = ""; // "12"
//		0
		while(n!=0) {
			int temp = n%10; //1
			n = n/10;

			if(temp != 0) {
				s = temp + s;
			}
		}

		System.out.println("After removing 0 from number "+a+", the new number is "+s+".");
	}

}

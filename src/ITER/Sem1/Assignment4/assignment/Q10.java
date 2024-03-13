package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int n = sc.nextInt(), a = n, max = 0, i = 0;
//		100							       9

		while(Math.pow(3, i) < n) {
			max = (int)Math.pow(3, i);
			i++;
		}

		System.out.println("The largest power of 3 less than or equal to "+a+ " is "+max);
	}

}

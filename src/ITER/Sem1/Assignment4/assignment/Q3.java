package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt(), c = n, sum = 0;
//			6					5			0
		System.out.print("Random numbers generated are: ");

		do {
			int ra = (int)(Math.random()*n + 1);
			System.out.print(ra + " ");
			sum+=ra;
			c--;
		}while(c>0);
		
		System.out.println();
		System.out.println("Average of "+n+" random numbers is: " + sum/n);


	}
//  6 5 4 3 2 1 c
}

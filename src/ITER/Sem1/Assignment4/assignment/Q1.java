package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number num1, num2, num3: ");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();


		int sum = 0;

		for (int i = a; i <= b; i += c) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("The sum of the numbers is: " + sum);


		
	}

}

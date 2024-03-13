package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt(), a = num, sum = 0;

		while(num != 0) {
			sum += num%10;
			num /= 10;
		}

		// 29  2+9  11


		if(sum%9 == 0) {
			System.out.println("Number " + a + " is divisible by 9");
		}else {
			System.out.println("Number " + a + " not is divisible by 9");
		}


	}

}

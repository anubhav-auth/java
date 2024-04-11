package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q5 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		int n = num, sum=0;

		for( int i = 1 ; i <= n/2 ; i++){


			if(n % i == 0){
				sum += i;
			}


		}



		if(sum==num)
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
 }
}

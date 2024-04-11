package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("the multiplication for the number "+n+" is ");
		int b;
		for(int i=1;i<=10;i++){
			b=n*i;
			 System.out.println(n+" x "+ i +" = "+b);
		}
	}

}

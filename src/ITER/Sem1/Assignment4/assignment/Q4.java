package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2 = sc.nextInt(), a=n1, b=n2, r;

		while(b>0){
			r = Math.abs(a-b);
			a = b;
			b = r;
		}

//		while (a>0 && b>0){
//			if (a>b) a = a%b;
//			else b = b%a;
//		}
		if (a==0) System.out.println(b);
		else System.out.println(a);
	    System.out.print("GCD of "+n1+" and "+n2+ " is "+a);
	}

}


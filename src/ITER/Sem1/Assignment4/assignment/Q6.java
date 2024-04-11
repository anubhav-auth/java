package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base:");
		int b = sc.nextInt();
			
		System.out.println("Enter the power:");
		int p = sc.nextInt();
		
		int result=1;
		
		for (int i=1;i<=p;i++){
			result = result * b;
		}
		
		
        System.out.println(b+" to the power "+p+" is:" +result);
	}

}

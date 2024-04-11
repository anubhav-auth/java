package pack1;

import java.util.Scanner;

import pack2.sports;

public class Test extends Student{
	
	public double mark1;
	public double mark2;
	
	public void inputDetails() {
		Scanner sc = new Scanner(System.in);
		
		super.inputDetails();
		
		System.out.print("Enter mark1: ");
		mark1 = sc.nextDouble();
		
		System.out.print("Enter mark2: ");
		mark2 = sc.nextDouble();
		
		
		
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("mark1: " + mark1 + "\nmark2: " + mark2);
	}

	
	
	

}

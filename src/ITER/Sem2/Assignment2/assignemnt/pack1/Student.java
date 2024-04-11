package pack1;

import java.util.Scanner;

public class Student {
	String name;
	int roll;
	
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		name = sc.nextLine();
		
		System.out.print("Enter roll: ");
		roll = sc.nextInt();
		
	}
	
	void showDetails() {
		System.out.println("name: " + name + "\nroll: " + roll);
	}
	
}

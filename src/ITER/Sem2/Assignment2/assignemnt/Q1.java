package ITER.Sem2.Assignment2.assignemnt;

import java.util.Scanner;

class person{
	String name;
	int age;
	
	public void setData() {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter name and age");
		name = sc.nextLine();
		age = sc.nextInt();
	}
	public void displayData() {
		System.out.println(name + " " + age);
	}
}

public class Q1 {

	public static void main(String[] args) {
		person p1 = new person();
		person p2 = new person();
		
		p1.name = "rohan";
		p1.age = 20;
		
		p2.setData();
		
		if(p1.age < p2.age) System.out.println(p1.name + " is younger");
		else System.out.println(p2.name + " is younger");
	}
	
	
}

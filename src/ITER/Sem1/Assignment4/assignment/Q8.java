package ITER.Sem1.Assignment4.assignment;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int lb=1,ub=10,cg,ug;
		do
		{
			 cg=(int)(lb+(ub-lb)*Math.random());
			 System.out.println("\nEnter user guess:");
			 ug=sc.nextInt();
			 System.out.println("Computer guess:"+cg);
			 System.out.println("User guess:"+ug);


			if(ug>cg)
				System.out.println("Too high, try again.");
			else if(ug<cg)
				System.out.println("Too low, try again.");
			else
				System.out.println("Good guess.");
		}while(ug!=cg);
	}

}

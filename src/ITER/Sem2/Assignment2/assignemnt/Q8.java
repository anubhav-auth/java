package ITER.Sem2.Assignment2.assignemnt;

import ITER.Sem2.Assignment2.assignemnt.pack2.sports;
import ITER.Sem2.Assignment2.assignemnt.pack1.Test;

public class Q8 implements sports {


	public static void main(String[] args) {
		
		Test t = new Test();
		Q8 e = new Q8();
		
		
		t.inputDetails();
		
		double totalMarks = t.mark1 + t.mark2;
		
		System.out.println("\n\n");
		
		t.showDetails();
		
		System.out.println("total marks : " + totalMarks);
		System.out.println("total score : " + e.grandTotal());
	}

	@Override
	public double grandTotal() {
		double grand = score1+score2;
		return grand;
	}


}

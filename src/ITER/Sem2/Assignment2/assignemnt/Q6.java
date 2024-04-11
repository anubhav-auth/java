package ITER.Sem2.Assignment2.assignemnt;

abstract class Marks{
	double markICP;
	double markDSA;
	double percentage;
	
	Marks(double markICP, double markDSA){
		this.markICP = markICP;
		this.markDSA = markDSA;
	}
	
	abstract void getPercentage();
	
}


class CSE extends Marks{
	double algoDesign;
	
	CSE(double markICP, double markDSA, double algoDesign){
		super(markICP, markDSA);
		this.algoDesign = algoDesign;
	}
	
	@Override
	void getPercentage() {
		
		System.out.println(((markDSA + markICP + algoDesign)/ 300)*100);
	}

}

class NonCSE extends Marks{
	double enggMechanics;
	
	NonCSE(double markICP, double markDSA, double enggMechanics){
		super(markICP, markDSA);
		this.enggMechanics = enggMechanics;
	}
	
	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		
		System.out.println(((markDSA + markICP + enggMechanics)/ 300)*100);
		
	}
	
}
public class Q6 {

	public static void main(String[] args) {
		
		
			CSE a = new CSE(90, 90, 90);
			NonCSE b = new NonCSE(80, 80, 80);
			
			a.getPercentage();
			b.getPercentage();
	}

}

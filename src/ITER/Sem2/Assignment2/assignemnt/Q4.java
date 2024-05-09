package ITER.Sem2.Assignment2.assignemnt;

class Deposit{
	long principle;
	int time;
	double rate;
	double totalAmt;
	Deposit(){

	}
	Deposit(long principle, int time, double rate){
		this.principle = principle;
		this.time = time;
		this.rate = rate;
	}
	Deposit(long principle, int time){
		this.principle = principle;
		this.time = time;
	}
	Deposit(long principle, double rate){
		this.principle = principle;
		this.rate = rate;
	}
	
	void display(){
		System.out.println(principle+ " " + rate + " " + time);
	}
	
	void calcAmt() {
		totalAmt = principle + (principle *rate* time)/100;
		System.out.println(totalAmt);
	}
	
}


public class Q4 {

	public static void main(String[] args) {
		
		Deposit dep = new Deposit(200, 20, 10);
		dep.display();
		dep.calcAmt();


	}

}

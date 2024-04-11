package ITER.Sem2.Assignment2.assignemnt;

class Deposit{
	long principle;
	int time;
	double rate;
	double totalAmt;
	Deposit(){}
	Deposit(long principle, int time, double rate){}
	Deposit(long principle, int time){}
	Deposit(long principle, double rate){}
	
	void display(){
		System.out.println(principle+ " " + rate + " " + time);
	}
	
	void calcAmt() {
		totalAmt = principle + (principle *rate* time)/100;
	}
	
}


public class Q4 {

	public static void main(String[] args) {
		
		

	}

}

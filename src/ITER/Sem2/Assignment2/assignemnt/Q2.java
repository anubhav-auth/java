package ITER.Sem2.Assignment2.assignemnt;

class complex{
	int real;
	int img;
	
	public void setData(int real, int img) {
		
		this.real = real;
		this.img = img;
	}
	
	public void displayData() {
		System.out.println(real + " + " + img+"i");
	}
	
	public complex add(complex a, complex b) {
		
		a.real = a.real + b.real;
		a.img = a.img + b.img;
		
		return a;
	}
}


public class Q2 {

	public static void main(String[] args) {
		complex a = new complex();
		complex b = new complex();
		
		a.setData(2,4);
		b.setData(3,6);
		
		complex c = a.add(a, b);
		
		c.displayData();

	}

}

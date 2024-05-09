package ITER.Sem2.Assignment2.assignemnt;

interface detailInfo{
	void display();
	void count();
}

class person2 implements detailInfo{
	
	static int maxCount;
	String name;
	
	person2(String name){
		this.name = name;
	}

	@Override
	public void count() {
		maxCount = name.length();
	}



	@Override
	public void display() {
		count();
		System.out.println("name is: " + name + " characters in the name are " + maxCount);
	}
}
public class Q7 {

	public static void main(String[] args) {
		person2 p1 = new person2("rohan");
		p1.display();
	}

}

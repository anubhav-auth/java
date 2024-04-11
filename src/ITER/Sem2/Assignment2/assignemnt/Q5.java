class person1{
	int age;
	String name;
	
	person1(int age , String name){
		this.age = age;
		this.name = name;
	}
}
class employee extends person1{
	int eId;
	double salary;
	
	employee(int age, String name, int eId, double salary){
		super(age, name);
		
		this.eId = eId;
		this.salary = salary;
		
	}
	
	void empDisplay(){
		System.out.println("eid: " + eId + " name: "+ name + " age: " + age + " salary: " + salary);
	}
	
	
}
public class Q5 {
	public static void main(String[] args) {
		employee e1 = new employee(21, "rohan", 21154, 500000.00);
		
		e1.empDisplay();
	}
}

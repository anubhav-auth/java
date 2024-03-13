package ITER.Sem2.Assignment2.assignemnt;

class Person{
    int age;
    String name;

    Person(String name, int age){
        this.age = age;
        this.name = name;
    }
}

class employee extends Person{
    int eid;
    int salary;
    employee(String name, int age, int eid, int salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }
    public void empDisplay(){
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(this.eid);
        System.out.println(this.salary);
    }
}



public class Q5 {
    public static void main(String[] args) {
        employee e = new employee("harry", 21, 1245, 10000);
        e.empDisplay();
    }
}

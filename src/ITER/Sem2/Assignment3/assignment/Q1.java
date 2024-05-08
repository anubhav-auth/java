package ITER.Sem2.Assignment3.assignment;

class base{
    base(){
        System.out.println("base");
    }
}

class derived1 extends base{
    derived1(){
        System.out.println("derived1");
    }
}

class derived2 extends derived1{
    derived2(){
        System.out.println("derived2");
    }
}
public class Q1 {
    public static void main(String[] args) {
        derived2 obj = new derived2();
    }
}

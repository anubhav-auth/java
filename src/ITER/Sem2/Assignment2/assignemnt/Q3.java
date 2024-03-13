package ITER.Sem2.Assignment2.assignemnt;

class complex {
    int real;
    int imag;
    public void setdata(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    public void display(){
        System.out.println(real+"+"+"i"+imag);
    }
    public complex add(complex num1,complex num2){
        complex result=new complex();
        result.real= num1.real+num2.real;
        result.imag= num1.imag+ num2.imag;

        return result;
    }

}
public class Q3{
    public static void main(String[] args) {
        complex complex1=new complex();
        complex1.setdata(2,3);
        complex complex2=new complex();
        complex2.setdata(4,5);
        complex1.display();
        complex2.display();
        complex sum=new complex();
        sum=sum.add(complex1,complex2);
        sum.display();
    }


}
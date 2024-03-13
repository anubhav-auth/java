package ITER.Sem2.Assignment2.assignemnt;

class Deposit{

    long principle;
    int time;
    double rate;
    double totalAmt;


    Deposit ( ){}
    Deposit (long principle, int time, double rate){

    }
    Deposit (long principle, double rate){

    }
    Deposit (long principle, int time){

    }

    void display(){
        System.out.println(this.principle);
        System.out.println(this.time);
        System.out.println(this.rate);
    }

    void calAmt(){
        this.totalAmt = this.principle + (this.principle*this.rate*this.time)/100;
    }

}


public class Q4 {

}

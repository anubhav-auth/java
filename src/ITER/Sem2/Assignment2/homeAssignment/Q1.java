package ITER.Sem2.Assignment2.homeAssignment;

import java.util.Scanner;

class Commission {
    int sales;
    Commission(){
        sales=0;
    }
    double getCommission(){
        double com;
        if(sales<100)
            com=0.02*sales;
        else if(sales>=500&&sales<5000)
            com=0.05*sales;
        else
            com=0.08*sales;
        return com;
    }
}
public class Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Commission ob=new Commission();
        System.out.print("No. of sales: ");
        int s=sc.nextInt();
        if(s<0) {
            System.out.println("Invalid Input.");
            System.exit(0);
        }
        ob.sales=s;
        System.out.println("Your sales: "+ob.getCommission());
    }
}

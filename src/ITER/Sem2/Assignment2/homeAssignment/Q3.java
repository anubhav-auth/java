package ITER.Sem2.Assignment2.homeAssignment;

import java.util.Scanner;

class Bank {
    String bankName;
    double depositAmount;
    static double totalAmount;
    static Scanner sc=new Scanner(System.in);
    public void setBankName(){
        System.out.print("Enter Bank Name: ");
        bankName=sc.next();
    }
    public void setAmount(){
        System.out.print("Enter Deposit Amount: ");
        depositAmount=sc.nextDouble();
        if(depositAmount<1000) {
            System.out.println("invalid. \n Reenter: ");
            setAmount();
        }
        totalAmount+=depositAmount;
    }
    public void showData(){
        System.out.println("Bank Name:      "+bankName);
        System.out.println("Deposit Amount: "+depositAmount);
        System.out.println("Total Amount:   "+totalAmount+"\n");
    }
}

public class Q3 {
    public static void main(String args[]) {

        Bank[] a = new Bank[5];
        int i;
        for (i = 0; i < 5; i++) {
            a[i] = new Bank();
            System.out.println((i + 1) +".");
            a[i].setBankName();
            a[i].setAmount();

        }
        for (i = 0; i < 5; i++)
            a[i].showData();

        double min=a[0].depositAmount;
        int j=0;
        for(i=1;i<5;i++) {
            if (a[i].depositAmount < min) {
                min=a[i].depositAmount;
                j=i;
            }
        }
        System.out.println("The bank with the Minimum Deposit: "+a[j].bankName);
    }
}

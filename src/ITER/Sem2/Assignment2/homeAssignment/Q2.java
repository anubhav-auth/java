package ITER.Sem2.Assignment2.homeAssignment;

import java.util.Scanner;

class Book {
    String BName;
    String BEdition;
    double BPrice;
    Book(String BName,String BEdition, double b){
        this.BName=BName;
        this.BEdition=BEdition;
        BPrice=b;
    }
    public void display(){
        System.out.println("Book Name:   " +BName);
        System.out.println("Edition:     " +BEdition);
        System.out.println("Price:       " +BPrice+"\n");
    }
}
public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book a[]=new Book[5];
        int i;
        for(i=0;i<5;i++){
            System.out.println((i+1)+".Input Details: Book Name, Edition, Price ");
            a[i]=new Book(sc.next(), sc.next(), sc.nextDouble());
        }

        for(i=0;i<5;i++)
            a[i].display();

        double max=a[0].BPrice;
        int j=0;

        for(i=1;i<5;i++){
            if(a[i].BPrice>max) {
                max=a[i].BPrice;
                j=i;
            }
        }
        System.out.println("The book with the Highest Amount: ");
        a[j].display();
    }
}

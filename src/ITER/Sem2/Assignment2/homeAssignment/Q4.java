package ITER.Sem2.Assignment2.homeAssignment;

import java.util.Scanner;

class Distance {
    float m,cm;
    Distance(){
        m=0;
        cm=0;
    }
    Distance(float m,float cm){
        this.m=m;
        this.cm=cm;
    }
    public void display(){
        System.out.println("Input: "+m+"m "+cm+"cm\n");
    }

    public Distance add(Distance ob1, Distance ob2) {
        Distance ob3=new Distance();
        ob3.m=ob1.m+ob2.m;
        ob3.cm=ob1.cm+ob2.cm;
        return ob3;
    }
}
public class Q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n=sc.nextInt();
        Distance a[]=new Distance[n+1];
        int i,j;
        for (i = 0; i < n; i++){
            System.out.println((i + 1) +". Enter distance at position "+i+" in metres and centimetres: ");
            a[i]=new Distance(sc.nextFloat(),sc.nextFloat());
        }
        for (i = 0; i < n; i++){
            a[i].display();
        }
        System.out.print("Enter position for whose values you want to add:");
        i= sc.nextInt();
        j= sc.nextInt();
        a[n]=a[i].add(a[i],a[j]);
        a[n].display();
    }
}

package ITER.Sem2.Assignment2.assignemnt;

import java.util.Scanner;

class person{
    int age;
    String name;


    void setData(int age, String name){
        this.age = age;
        this.name = name;
    }

    void displayData(){
        System.out.println(this.name + " " + this.age);
    }
}


public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        person p1 = new person();
        person p2 = new person();

        p1.setData(20, "Rohan");
        p2.setData(sc.nextInt(), sc.next());

        if (p1.age > p2.age) System.out.println(p1.name + " is older");
        else System.out.println(p2.name + " is older");
    }
}

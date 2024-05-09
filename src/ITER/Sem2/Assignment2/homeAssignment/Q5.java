package ITER.Sem2.Assignment2.homeAssignment;
import java.util.*;
class PointType {
    float x,y;
    static Scanner sc=new Scanner(System.in);
    PointType(){
        x=0;
        y=0;
    }
    PointType(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void setPoint(){
        System.out.print("Enter coordintes of point in x-axis: ");
        x=sc.nextFloat();
        System.out.print("Enter coordintes of point in y-axis: ");
        y= sc.nextFloat();
    }
    public float PointX(){
        return x;
    }
    public float PointY(){
        return y;
    }
    public void Update(){
        System.out.print("Enter the axis whose coordinates you want to update: ");
        char ch=sc.next().charAt(0);
        if(Character.toUpperCase(ch)=='X')
            x=sc.nextFloat();
        else if(Character.toUpperCase(ch)=='Y')
            y=sc.nextFloat();
        else{
            System.out.println("Wrong choice");
            Update();
        }
    }
    public void display(){
        System.out.println("Input: ("+x+", "+y+")\n");
    }

}
class CircleType extends PointType{
    double rad;
    static int count=0;
    CircleType(double rad,float x,float y){
        super(x,y);
        this.rad=rad;
    }

    public double Radius(){
        return rad;
    }

    public void display(){
        System.out.println("Position: "+count++ +"\nRadius: "+rad);
        super.display();

    }
    public void CalcArea(){
        double ar=Math.PI*(rad*rad);
        System.out.println("Area: "+ar);
    }
    public void CalcCircum(){
        double cf=2*Math.PI*rad;
        System.out.println("Circumference: "+cf);
    }
    public void DisplayRadius(){
        System.out.println("Radius: "+rad);
    }
}
public class Q5 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter limit: ");
        int n=sc.nextInt();
        CircleType a[]=new CircleType[n];
        int i,j;
        for(i=0;i<n;i++){
            System.out.println("Enter radius, coordinate x and coordinate y:");
            a[i]=new CircleType(sc.nextDouble(), sc.nextFloat(), sc.nextFloat());
        }
        for(i=0;i<n;i++){
            a[i].display();
        }
        for(i=0;i<1;){
            System.out.print("Enter the position to the Data you want to work with: ");
            j=sc.nextInt();
            if(j<n&&j>-1) {
                perform(a[j]);
            }
            System.out.println("\nContinue working with another data?\n1: Yes\n0: No");
            j=sc.nextInt();
            if(j==0)
                break;
        }
        System.out.println("Task Completed.");
        System.exit(0);
    }
    public static void perform(CircleType ob){
        int ch;
        while(true) {
            System.out.println("Enter a choice: \n1: to SetCoordinates");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    ob.setPoint();
                    break;
                default:
                    System.out.println("Wrong Choice.\n");
            }
            System.out.println("Continue? Enter 0 to exit.");
            ch=sc.nextInt();
            if(ch==0) {
                System.out.println("Termination Successful.");
                break;
            }
        }
    }
}

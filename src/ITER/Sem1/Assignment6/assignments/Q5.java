package ITER.Sem1.Assignment6.assignments;

public class Q5 {
    public static void main(String[] args) {

        System.out.println(area(5, 34));

    }
    public static double area(int n, double side){

        return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
    }
}

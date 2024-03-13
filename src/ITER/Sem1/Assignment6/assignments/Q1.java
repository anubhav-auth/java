package ITER.Sem1.Assignment6.assignments;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(additionSimple(2,3));
    }
    public static int additionSimple(int x, int y){
        System.out.print("Sum of "+x+" and " + y + " is: ");
        return x + y;
    }
    public static int subtractionSimple(int x, int y){
        System.out.print("Difference of "+x+" and " + y + " is: ");
        return y-x;
    }
    public static int multiplicationSimple(int x, int y){
        System.out.print("Product of "+x+" and " + y + " is: ");
        return x * y;
    }
    public static double divisionSimple(int x, int y){
        System.out.print(x+" divided by " + y + " is: ");
        return x / (double)y;
    }
    public static int remainderSimple(int n, int m){
        System.out.print("remainder of "+n+" divided by " + m + " is: ");
        return n%m;
    }
    public static double squareRootSimple(int n){
        System.out.print("Square-root of "+n+" is: ");
        return Math.sqrt(n);
    }


}

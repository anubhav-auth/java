package ITER.Sem1.Assignment6.assignments;

public class Q10 {
    public static void main(String[] args) {
    calculateArea(2.0,2.0f);
    }


    //triangle
    public static double calculateArea(double base, float height) {
        return 0.5 * base * height;
    }


    // square
    public static double calculateArea(double side) {
        return side * side;
    }


    //circle
    public static double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }


    // rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}

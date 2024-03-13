package ITER.Sem1.Assignment6.homeAssignments;

public class Q2 {
    public static void main(String[] args) {

    }
    public static double calculateVolume(double length, double height, double width) {
        return length*width*height;
    }


    // square
    public static double calculateVolume(double side) {
        return side * side * side;
    }


    //circle
    public static double calculateVolume(float radius) {
        return (4/3)*Math.PI * Math.pow(radius,3);
    }
}

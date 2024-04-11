package ITER.Sem1.Assignment2.commandLineHomeAssigment;

public class cmdargp2 {
    public static void main(String[] args) {
    double r = Double.parseDouble(args[0]);
    double h = Double.parseDouble(args[1]);

    double A = (Math.PI * r*r) + (2*Math.PI *r*h);
    System.out.println("The surface area is: " + A);

    }
}

package ITER.Sem1.Assignment2.commandLineArgs;

public class cmdargp4 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);

        double degree = Math.toRadians(t);
        double val = Math.cos(5*degree) + Math.sin(7*degree);
        System.out.println(" when t = " + t +", Cos(5t) + Sin(7t) = " + val);
    }
}

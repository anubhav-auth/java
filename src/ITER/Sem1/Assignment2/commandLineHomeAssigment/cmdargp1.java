package ITER.Sem1.Assignment2.commandLineHomeAssigment;

public class cmdargp1 {
    public static void main(String[] args) {
        double principle = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double si = (principle*rate*time)/100;
        System.out.println("the interest is: " + si);
    }
}

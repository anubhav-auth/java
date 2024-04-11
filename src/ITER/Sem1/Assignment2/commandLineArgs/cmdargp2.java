package ITER.Sem1.Assignment2.commandLineArgs;

public class cmdargp2 {
    public static void main(String[] args) {
        System.out.println("The first argument is " + args[0]);
        System.out.println("The second argument is " + args[1]);

        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        int pow = (int)Math.pow(first, second);
        System.out.println(first + " to the power of " + second + " is " + pow);
    }
}

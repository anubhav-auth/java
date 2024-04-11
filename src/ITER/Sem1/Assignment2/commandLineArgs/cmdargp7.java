package ITER.Sem1.Assignment2.commandLineArgs;

public class cmdargp7 {
    public static void main(String[] args) {
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        int a3 = Integer.parseInt(args[2]);

        boolean b = ((a1 <= (a2 * a3)) || (a2 <= (a1 * a3)) || (a3 <= (a1 * a2)));
        System.out.println(b);
    }
}


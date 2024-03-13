package ITER.Sem1.Assignment2.commandLineArgs;

public class cmdargp5 {
    public static void main(String[] args) {
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        int a3 = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(a1, a2), a3);
        int min = Math.min(Math.min(a1, a2), a3);
        int mid = (a1 + a2 + a3) - (max + min);

        System.out.println("The numbers is ascending order is " + min + " " + mid + " " + max);
    }
}

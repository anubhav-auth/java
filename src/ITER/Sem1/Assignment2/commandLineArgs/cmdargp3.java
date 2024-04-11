package ITER.Sem1.Assignment2.commandLineArgs;

public class cmdargp3 {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);


        int d1 = (int) (Math.random() * (max - min + 1) + min) ;
        int d2 = (int) (Math.random() * (max - min + 1) + min) ;
        int sum = d1 + d2;
        System.out.println("In the first turn you got " + d1);
        System.out.println("In the second turn you got " + d2);
        System.out.println("The sum of 2 rolling is " + sum);
    }
}

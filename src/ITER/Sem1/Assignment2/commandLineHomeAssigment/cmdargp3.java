package ITER.Sem1.Assignment2.commandLineHomeAssigment;

public class cmdargp3 {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);

    int b = a%10;
    int c = (a/1000);
    System.out.println("the sum of the first and last digit is: " + (b+c));
    }
}

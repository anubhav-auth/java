package ITER.Sem1.Assignment2.commandLineArgs;

    public class cmdargp1 {
        public static void main(String[] args) {
            System.out.println("First input is " + args[0]);
            System.out.println("Second input is " + args[1]);

            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient is " + quotient);
            System.out.println("Remainder is " + remainder);
        }
    }

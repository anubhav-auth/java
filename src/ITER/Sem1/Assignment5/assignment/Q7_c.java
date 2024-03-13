package ITER.Sem1.Assignment5.assignment;

public class Q7_c {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = i; j <= 4 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

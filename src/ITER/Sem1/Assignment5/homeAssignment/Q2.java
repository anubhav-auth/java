package ITER.Sem1.Assignment5.homeAssignment;

public class Q2 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {

            for (int j = i; j < 3 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

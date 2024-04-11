package ITER.Sem1.Assignment5.assignment;

public class Q6_d {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            int a = 1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}

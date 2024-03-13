package ITER.Sem1.Assignment5.assignment;

public class Q6_c {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}

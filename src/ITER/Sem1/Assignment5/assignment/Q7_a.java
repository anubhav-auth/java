package ITER.Sem1.Assignment5.assignment;

public class Q7_a {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            char a = 'A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}

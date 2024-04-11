package ITER.Sem1.Assignment4.homeAssignment;

public class Q3 {
    public static void main(String[] args) {
        int x =0;
        for (int i = 1000; i < 2000; i++) {
            System.out.print(i + " ");
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }
}

package ITER.Sem1.Assignment5.homeAssignment;

public class Q1 {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.print("* ");
//            for (int k = 1; k < i; k++) {
//                System.out.print(k + " ");
//            }
            for (int j = 5; j > 0 ; j--) {
                if (j == i) {
                    System.out.print("* ");
                }else {
                    System.out.print(j +" ");
                }
            }
            System.out.println();
        }
    }
}

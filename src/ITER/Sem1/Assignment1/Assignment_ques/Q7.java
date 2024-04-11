package ITER.Sem1.Assignment1.Assignment_ques;

public class Q7 {
    public static void main(String[] args) {
        int x = 9;
        int y = 12;
        int z;
        System.out.println("Before swap: x = " + x + ", y = " +y);

        z = x;
        x = y;
        y = z;
        System.out.println("After swap: x = " + x + ", y = " +y);
    }
}
